package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import JDBCConnector.CONNDRIVER;
import MODEL.LoginModel;

public class LoginDao {
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	
	public LoginModel CheckIN(String uname, String pass) {
		try {
			String query = "SELECT * FROM projectpro.login where username = ? and password = ?";
			conn = new CONNDRIVER().getConnec();
			ps = conn.prepareStatement(query);
			ps.setString(1, uname);
			ps.setString(2, pass);
			rs = ps.executeQuery();
			while(rs.next()) {
				LoginModel loginmodel = new LoginModel(uname, pass);
				return loginmodel;
			}
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
	
	public void getDangky(String fullname, String email, int numberphone, String username, String password){
		try {
			String query = "INSERT INTO projectpro.login (fullname, email, numberphone, username, password) VALUES (?, ?, ?, ?, ?)";
			ps = conn.prepareStatement(query);
			LoginModel login = new LoginModel();
			ps.setString(1, fullname);
			ps.setString(2, email);
			ps.setInt(1, numberphone);
			ps.setString(4, username);
			ps.setString(5, password);
			ps.executeUpdate();
			
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	public LoginModel CheckLogin(String username){
		try {
			String query = "select * from projectpro.login where username = ?";
			ps = conn.prepareStatement(query);
			LoginModel login = new LoginModel();
			ps.setString(1, username);
			rs = ps.executeQuery();
			while(rs.next()) {
				while(rs.next()) {
					return new LoginModel(rs.getString(1), rs.getString(2), rs.getInt(3), rs.getString(4), rs.getString(5));
				}
			}
			
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}
