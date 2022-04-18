package JDBCConnector;

import java.sql.Connection;
import java.sql.DriverManager;

public class CONNDRIVER {
	private String url = "jdbc:mysql://localhost:3306/projectpro";
	private String uname = "root";
	private String pass = "123456";
	public Connection getConnec() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			return DriverManager.getConnection(url, uname, pass);
		} catch (Exception e) {
			e.getMessage();
		}
		return null;
	}
}
