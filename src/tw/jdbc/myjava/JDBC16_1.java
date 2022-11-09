package tw.jdbc.myjava;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

public class JDBC16_1 {

	public static void main(String[] args) {

		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");

		String sql = "SELECT * FROM member WHERE id = ?";

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eeit53", prop);
			PreparedStatement pstmt = conn.prepareStatement(sql);

			pstmt.setInt(1, 1);
			ResultSet rs = pstmt.executeQuery();

			rs.next();

			FileOutputStream fout = new FileOutputStream("dir2/ball0.png");

			InputStream in = rs.getBinaryStream("icon");
			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) != -1) {
				fout.write(buf, 0, len);
			}

			in.close();

			fout.flush();
			fout.close();
			rs.close();
			pstmt.close();
			conn.close();

		} catch (Exception e) {

		}

	}

}
