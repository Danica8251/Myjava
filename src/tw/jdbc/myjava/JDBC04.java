package tw.jdbc.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;


public class JDBC04 {

	public static void main(String[] args) {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");
		
		
		try {
			Connection conn = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/eeit53",prop);
			
			
			// 3. SQL statement
			String sql1 = "INSERT INTO cust (cname,tel,birthday) VALUES" +
						"('tony','111','1991-01-02'),"+
						"('tony','111','1991-01-02'),"+
						"('tony','111','1991-01-02')";
			String sql2 = "DELETE FROM cust WHERE id >= 4"; // 刪除
			String sql3 = "UPDATE cust SET cname='eric',tel='777' WHERE id = 3"; // 修改

			Statement stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql3);
			System.out.println(count);
			
			conn.close();
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
