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
	
	//Lấy dữ liệu của bảng Giảng Viên
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
			e.printStackTrace();
		}
		return list;
	}
	//Lấy id của từng giảng viên
	public GiangVienModel getGVbyID(String id) {
		String query =  "select * from projectpro.tblgiangvien where Magv = ?";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(0, id);
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getLong(1));
				return new GiangVienModel(rs.getLong(1), rs.getString(2), rs.getDouble(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	//Cập nhập thông tin giảng viên
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
	// Thêm giảng viên theo khoa
	public void getAdd(String hoten, double luong, long makhoa) {
		String query = "insert Into projectpro.tblgiangvien (Hotengv, Luong, Makhoa) values(?,?,?)";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, hoten);
			ps.setDouble(2, luong);
			ps.setLong(3, makhoa);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	//Chuyển giảng viên Sang khoa khác
	public void getDataMigration(String magv, String makhoa) {
		String query = "Update projectpro.tblgiangvien set Makhoa = ? where Magv = ?";
		try {
			ps = conn.prepareStatement(query);
			ps.setString(1, makhoa);
			ps.setString(2, magv);
			ps.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
