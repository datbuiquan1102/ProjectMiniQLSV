package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.GiangVienModel;
import MODEL.KhoaModel;

public class KhoaDAO {
	Connection conn = new CONNDRIVER().getConnec();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<KhoaModel> getKhoaDAO(){
		List<KhoaModel> list = new ArrayList<KhoaModel>();
		Connection conn = new CONNDRIVER().getConnec();
		try {
			String query = "select * from projectpro.tblkhoa";
			 ps = conn.prepareStatement(query);
			 rs = ps.executeQuery();
			while (rs.next()) {
				KhoaModel khoa = new KhoaModel();
				khoa.setMakhoa(rs.getLong(1));
				khoa.setTenkhoa(rs.getString(2));
				list.add(khoa);			
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Loi day");
		}
		return list;
	}
	
	public List<GiangVienModel> getGVbyIDKhoa(String makhoa){
		List<GiangVienModel> list = new ArrayList<GiangVienModel>();
		String query = "select gv.Magv, gv.Hotengv, gv.Luong, k.Makhoa from projectpro.tblgiangvien gv join projectpro.tblkhoa k on k.Makhoa = gv.Makhoa where k.Makhoa = ?";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, makhoa);
			rs = ps.executeQuery();
			while(rs.next()) {
				GiangVienModel gv = new GiangVienModel();
				gv.setMagv(rs.getLong(1));
				gv.setHoten(rs.getString(2));
				gv.setLuong(rs.getDouble(3));
				gv.setMakhoa(rs.getLong(4));
				list.add(gv);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
