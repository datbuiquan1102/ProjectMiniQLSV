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
	public List<GiangVienModel> getGVDAO(){
		List<GiangVienModel> list = new ArrayList<GiangVienModel>();
		Connection conn = new CONNDRIVER().getConnec();
		PreparedStatement ps = null;
		ResultSet rs = null;
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
		}
		return list;
	}
}
