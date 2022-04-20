package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.GiangVienModel;

public class GiangVienDAO {
	Connection conn = new CONNDRIVER().getConnec();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<GiangVienModel> getGVDAO(){
		List<GiangVienModel> list = new ArrayList<GiangVienModel>();

		String query = "select * from projectpro.tblgiangvien";
		
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
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
			System.out.println("quan que");
		}
		return list;
	}
	
	public List<GiangVienModel> getGVInKhoa(long makhoa){
		List<GiangVienModel> list = new ArrayList<GiangVienModel>();
		String query = "select gv.Magv, gv.Hotengv, gv.Luong, k.Makhoa from projectpro.tblgiangvien gv join projectpro.tblkhoa k on k.Makhoa = gv.Makhoa where k.Makhoa = ?";
		try {
			ps = conn.prepareStatement(query);
			ps.setLong(1, makhoa);
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
	
	public GiangVienModel getGVbyID(String id) {
		String query =  "select * from projectpro.tblgiangvien where Magv = ?";
		System.out.println(query);
		try {
			ps = conn.prepareStatement(query);
			ps.setString(0, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getLong(1));
				return new GiangVienModel(rs.getLong(1), rs.getString(2), rs.getDouble(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public void UpdateGV(String hoten, double luong, long magv) {
		String query = "UPDATE projectpro.tblgiangvien SET Hotengv = ?,Luong = ? WHERE Magv = ?";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, hoten);
			ps.setDouble(2, luong);
			ps.setLong(3, magv);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
