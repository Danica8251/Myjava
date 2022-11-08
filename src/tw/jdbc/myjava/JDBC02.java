package tw.jdbc.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC02 {

	public static void main(String[] args) {
		try {
			// 寫法一
//			Connection conn = DriverManager.getConnection(
//					"jdbc:mysql://localhost:3306/eeit53?user=root&password=root");

			// 寫法二
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eeit53", "root", "root");

			// 3. SQL statement
			Statement stmt = conn.createStatement();
			stmt.execute("INSERT INTO cust (cname,tel,birthday) VALUES ('tony','111','1991-01-02')");

			conn.close();
			System.out.println("OK2");
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
