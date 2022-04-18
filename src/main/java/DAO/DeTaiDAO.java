package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.DeTaiModel;

public class DeTaiDAO {
	Connection con = new CONNDRIVER().getConnec();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<DeTaiModel> getDTDAO(){
		List<DeTaiModel> list = new ArrayList<DeTaiModel>();
		String query = "select * from projectpro.tbldetai";
		try {
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				DeTaiModel dt = new DeTaiModel();
				dt.setMadt(rs.getLong(1));
				dt.setTendt(rs.getString(2));
				dt.setKinhphi(rs.getInt(3));
				dt.setNoithuctap(rs.getString(4));
				dt.setIs_active(rs.getInt(5));
				list.add(dt);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public void getInsertDetai(String tendetai, int kinhphi, String noithuctap) {
		String query = "INSERT INTO projectpro.tbldetai (Tendt, Kinhphi, Noithuctap) VALUES (?, ?, ?)";
		try {
			ps = con.prepareStatement(query);
			ps.setString(1, tendetai);
			ps.setInt(2, kinhphi);
			ps.setString(3, noithuctap);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}