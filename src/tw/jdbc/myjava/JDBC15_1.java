package tw.jdbc.myjava;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;

public class JDBC15_1 {

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");

		String sql = "UPDATE member SET icon = ? WHERE id = ?";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eeit53", prop);
			PreparedStatement pstmt = conn.prepareStatement(sql);

			FileInputStream fin = new FileInputStream("dir1/ball0.png");

			pstmt.setBinaryStream(1, fin);
			pstmt.setInt(2, 1);
			if (pstmt.executeUpdate() > 0) {
				System.out.println("OK");
			} else {
				System.out.println("XX");
			}

			fin.close();
			pstmt.close();
			conn.close();

		} catch (Exception e) {

		}

	}

}
