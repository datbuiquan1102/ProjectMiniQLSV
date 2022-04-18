package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.HDModul;
import MODEL.HuongDanModel;

public class HuongDanDAO {
	Connection conn = new CONNDRIVER().getConnec();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<HuongDanModel> getAllHuongDan(){
		List<HuongDanModel> list = new ArrayList<HuongDanModel>();
		String query = "select sv.Hotensv, dt.Tendt, dt.Noithuctap, hd.KetQua from projectpro.tblsinhvien sv join projectpro.tblhuongdan hd on hd.Masv = sv.Masv join projectpro.tbldetai dt on dt.Madt = hd.Madt";
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				HuongDanModel model = new HuongDanModel();
				model.setHotensv(rs.getString(1));
				model.setTendt(rs.getString(2));
				model.setNoithuctap(rs.getString(3));
				model.setKetqua(rs.getDouble(4));
				list.add(model);
		
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return list;
	}
	
	public HuongDanModel getIdHuongDan(String id) {
		
		String query = "select sv.Hotensv, dt.Tendt, dt.Noithuctap, hd.KetQua from projectpro.tblsinhvien sv join projectpro.tblhuongdan hd on hd.Masv = sv.Masv join projectpro.tbldetai dt on dt.Madt = hd.Madt join projectpro.tblgiangvien gv on gv.Magv = hd.Magv where sv.Masv = ?";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();System.out.println("a");
			while(rs.next()) {
				return new HuongDanModel(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getDouble(5));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Loi o day");
		}
		return null;
	}
	
//        public List<HuongDanModel> getIdHuongDan(String id) {
//		List<HuongDanModel> list = new ArrayList<HuongDanModel>();
//		String query = "select sv.Hotensv, dt.Tendt, dt.Noithuctap, hd.KetQua from projectpro.tblsinhvien sv join projectpro.tblhuongdan hd on hd.Masv = sv.Masv join projectpro.tbldetai dt on dt.Madt = hd.Madt join projectpro.tblgiangvien gv on gv.Magv = hd.Magv where sv.Masv = ?";
//		try {
//			ps = conn.prepareStatement(query);
//			ps.setString(1, id);
//			rs = ps.executeQuery();System.out.println("a");
//			while(rs.next()) {
//				HuongDanModel hd = new HuongDanModel();
//				hd.setHotensv(rs.getString(1));
//				hd.setTendt(rs.getString(2));
//				hd.setNoithuctap(rs.getString(3));
//				hd.setKetqua(rs.getDouble(4));
//				list.add(hd);
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//			System.out.println("Loi o day");
//		}
//		return list;
//	}
	
	public List<HuongDanModel> getChuaNhanDT(String id) {
		String query = "select sv.Masv, sv.Hotensv from projectpro.tblsinhvien sv where NOT exists(select hd.Magv from projectpro.tblhuongdan hd where ? = ?)";
		List<HuongDanModel> list = new ArrayList<HuongDanModel>();
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				HuongDanModel hd = new HuongDanModel();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
