package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.HuongDanModel;

public class HuongDanDAO {
	Connection conn = new CONNDRIVER().getConnec();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<HuongDanModel> getAllHuongDan(){
		List<HuongDanModel> list = new ArrayList<HuongDanModel>();
		String query = "select sv.Masv, hd.Madt, gv.Magv, gv.Hotengv, sv.Hotensv, dt.Tendt, dt.Noithuctap, hd.KetQua from projectpro.tblsinhvien sv join projectpro.tblhuongdan hd on hd.Masv = sv.Masv join projectpro.tbldetai dt on dt.Madt = hd.Madt join projectpro.tblgiangvien gv on gv.Magv = hd.Magv";
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				HuongDanModel model = new HuongDanModel();
				model.setMasv(rs.getLong(1));
				model.setMadt(rs.getLong(2));
				model.setMagv(rs.getLong(3));
				model.setTengv(rs.getString(4));;
				model.setHotensv(rs.getString(5));
				model.setTendt(rs.getString(6));
				model.setNoithuctap(rs.getString(7));
				model.setKetqua(rs.getDouble(8));
				list.add(model);
		
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return list;
	}
	
	public HuongDanModel getHuongDanByID(String id) {
		
		String query = "select sv.Masv, hd.Madt, gv.Magv, gv.Hotengv, sv.Hotensv, dt.Tendt, dt.Noithuctap, hd.KetQua from projectpro.tblsinhvien sv join projectpro.tblhuongdan hd on hd.Masv = sv.Masv join projectpro.tbldetai dt on dt.Madt = hd.Madt join projectpro.tblgiangvien gv on gv.Magv = hd.Magv where sv.Masv = ?";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery();System.out.println("a");
			while(rs.next()) {
				return new HuongDanModel(rs.getLong(1), rs.getLong(2), rs.getLong(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getDouble(8));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
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
