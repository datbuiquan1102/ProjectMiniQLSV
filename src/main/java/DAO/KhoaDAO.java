package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.KhoaModel;

public class KhoaDAO {
	public List<KhoaModel> getKhoaDAO(){
		List<KhoaModel> list = new ArrayList<KhoaModel>();
		Connection conn = new CONNDRIVER().getConnec();
		try {
			String query = "select * from projectpro.tblkhoa";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				KhoaModel khoa = new KhoaModel();
				khoa.setMakhoa(rs.getLong(1));
				khoa.setTenkhoa(rs.getString(2));
				khoa.setDienthoai(rs.getString(3));
				list.add(khoa);			
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Loi day");
		}
		return list;
	}
}
