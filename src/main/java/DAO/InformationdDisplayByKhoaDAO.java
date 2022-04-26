package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.GiangVienModel;
import MODEL.InformationdDisplayByKhoaModel;
import MODEL.KhoaModel;
import MODEL.SinhVienModel;

public class InformationdDisplayByKhoaDAO{
	Connection conn = new CONNDRIVER().getConnec();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<KhoaModel> getAllIDByKhoa(){
		List<KhoaModel> list = new ArrayList<KhoaModel>();
		String query = "Select distinct * from tblkhoa";
		try {
			ps = conn.prepareStatement(query);
			System.out.println(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				KhoaModel khoa = new KhoaModel();
				khoa.setMakhoa(rs.getLong(1));
				khoa.setTenkhoa(rs.getString(2));
				System.out.println(khoa);
				list.add(khoa);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
