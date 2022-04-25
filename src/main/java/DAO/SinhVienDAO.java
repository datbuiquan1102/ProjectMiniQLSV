package DAO;

import java.math.BigInteger;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.SinhVienModel;

public class SinhVienDAO {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<SinhVienModel> getSVDAO(){
		List<SinhVienModel> list = new ArrayList<SinhVienModel>();
		
		String query = "select * from projectpro.tblsinhvien";
		conn = new CONNDRIVER().getConnec();
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				SinhVienModel sv = new SinhVienModel();
				sv.setMasv(rs.getLong(1));
				sv.setHotensv(rs.getString(2));
				sv.setMakhoa(rs.getLong(3));
				sv.setNamsinh(rs.getDate(4));
				sv.setQuequan(rs.getString(5));
				sv.setIs_active(rs.getInt(6));
				list.add(sv);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
	
	public void DeleteStudenst(long id) {
		String query = "Update projectpro.tblsinhvien set is_active = '0' where Masv = ?";
		try {
			conn = new CONNDRIVER().getConnec();
			ps = conn.prepareStatement(query);
			ps.setLong(1, id);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public SinhVienModel getUpdateSV(String id) {
		String query = "select * from projectpro.tblsinhvien where Masv = ?";
		try {
			conn = new CONNDRIVER().getConnec();
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			rs = ps.executeQuery(); 
			while (rs.next()) {
				return new SinhVienModel(rs.getLong(1), rs.getString(2), rs.getLong(3), rs.getDate(4), rs.getString(5));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public void UpdateSV(Long masv, String tensv,Date namsinh, String quequan) {
		String query = "UPDATE TBLSinhVien SET Hotensv = ?, Namsinh = ?, Quequan = ? WHERE Masv = ?";
		try {
			conn = new CONNDRIVER().getConnec();
			ps = conn.prepareStatement(query);
			ps.setString(1, tensv);
			ps.setDate(2, namsinh);
			ps.setString(3, quequan);
			ps.setLong(4, masv);
			ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void getAddSV(String hoten, long makhoa, Date namsinh, String quequan) {
		String query = "Insert Into projectpro.tblsinhvien (Hotensv, Makhoa,  Namsinh, QueQuan) values (?,?,?,?)";
		System.out.println(query);
		try {
			conn = new CONNDRIVER().getConnec();
			ps = conn.prepareStatement(query);
			ps.setString(1, hoten);
			ps.setLong(2, makhoa);
			ps.setDate(3, namsinh);
			ps.setString(4, quequan);
			ps.executeUpdate();
			System.out.println("vao day");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
