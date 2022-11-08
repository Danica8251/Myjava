package tw.jdbc.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JDBC03 {

	public static void main(String[] args) {
		// 寫法三→老師推薦，彈性較大
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		
		try {
			// 寫法一
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/eeit53?user=root&password=root");
			
			// 寫法二
//			Connection conn = DriverManager.getConnection(
//			"jdbc:mysql://localhost:3306/eeit53","root","root");
			
			// 寫法三→老師推薦，彈性較大
			Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/eeit53",prop);
			
			
			// 3. SQL statement
			String sql1 = "INSERT INTO cust (cname,tel,birthday) VALUES ('tony','111','1999-01-02')";
			String sql2 = "SELECT * FROM cust";
			Statement stmt = conn.createStatement();
			boolean b = stmt.execute(sql2);
			
			System.out.println(b);
			
			conn.close();
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
