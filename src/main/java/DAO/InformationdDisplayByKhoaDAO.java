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
	public List<InformationdDisplayByKhoaModel> getAllIDByKhoa(){
		List<InformationdDisplayByKhoaModel> list = new ArrayList<InformationdDisplayByKhoaModel>();
		String query = "Select * from tblkhoa k join tblgiangvien gv on gv.Makhoa = k.Makhoa join tblsinhvien sv on sv.Makhoa = k.Makhoa";
		try {
			ps = conn.prepareStatement(query);
			System.out.println(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println("ducba");
				InformationdDisplayByKhoaModel info;
				KhoaModel khoa = new KhoaModel();
				khoa.setMakhoa(rs.getLong(1));
				khoa.setTenkhoa(rs.getString(2));
				GiangVienModel giangvien = new GiangVienModel();
				giangvien.setMagv(rs.getLong(3));
				giangvien.setHoten(rs.getString(4));
				giangvien.setLuong(rs.getDouble(5));
				giangvien.setMakhoa(rs.getLong(6));
				SinhVienModel sinhvien = new SinhVienModel();
				sinhvien.setMasv(rs.getLong(7));
				sinhvien.setHotensv(rs.getString(8));
				sinhvien.setMakhoa(rs.getLong(9));
				sinhvien.setNamsinh(rs.getDate(10));
				sinhvien.setQuequan(rs.getString(11));
				info = new InformationdDisplayByKhoaModel(khoa, sinhvien, giangvien);
				System.out.println(info);
				list.add(info);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return list;
	}
}
