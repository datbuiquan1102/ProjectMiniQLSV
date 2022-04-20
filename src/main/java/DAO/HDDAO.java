package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.HDModel;

public class HDDAO {
	Connection conn = new CONNDRIVER().getConnec();
	PreparedStatement ps = null;
	ResultSet rs = null;
	public List<HDModel> getListHD(){
		List<HDModel> list = new ArrayList<HDModel>();
		String query = "select gv.Hotengv, sv.Hotensv, dt.Tendt, hd.KetQua from projectpro.tblsinhvien sv join projectpro.tblhuongdan hd on hd.Masv = sv.Masv join projectpro.tbldetai dt on dt.Madt = hd.Madt join projectpro.tblgiangvien gv on gv.magv = hd.Magv";
		try {
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				HDModel hd = new HDModel();
				hd.setTengv(rs.getString(1));
				hd.setTensv(rs.getString(2));
				hd.setTendt(rs.getString(3));
				hd.setKetqua(rs.getDouble(4));
				list.add(hd);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
		
	}
}
