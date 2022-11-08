package tw.jdbc.myjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.json.JSONStringer;
import org.json.JSONWriter;

public class JDBC13 {

	public static void main(String[] args) {
		String sql = "	select e.lastname, sum(od.unitprice * od.quantity) sum from orders o\r\n"
				+ "	join employees e on (o.employeeid = e.employeeid)\r\n"
				+ "	join orderdetails od on (o.orderid = od.orderid)\r\n" + "	group by e.employeeid\r\n"
				+ "	order by sum desc";

		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");

		try {
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eeit53", prop);
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			JSONStringer js = new JSONStringer();
			JSONWriter jw = js.array();

			int i = 0;
			while (rs.next()) {
				String name = rs.getString("lastname");
				String sum = rs.getString("sum");
				// System.out.printf("%s:%s\n", name, sum);

				jw.object();
				jw.key("lastname").value(name);
				jw.key("sum").value(sum);
				jw.endObject();

			}

			jw.endArray();
			System.out.println(jw.toString());

			stmt.close();
			rs.close();
			conn.close();
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
