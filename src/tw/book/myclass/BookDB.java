package tw.book.myclass;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BookDB {
	/* 宣告 */
	private Connection conn; // 連接資料庫
	private ResultSet rs; // 資料庫返回的資料通過ResultSet 介面獲取
	private String[] fieldNames;

	/* 建構式，初始化時該做的事=>連接資料庫，並拋出SQL例外 */
	public BookDB() throws SQLException {
		Properties prop = new Properties();
		prop.put("user", "root");
		prop.put("password", "root");

		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/eeit53", prop);

	}

	/* 宣告queryData 並拋出SQL例外 */
	public void queryData(String sql) throws SQLException {

		Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE); // 執行靜態SQL語句返回它生成結果
		rs = stmt.executeQuery(sql);

		ResultSetMetaData rsmd = rs.getMetaData(); // 得到結果集(rs)的結構，比如字段數、字段名等
		int colCount = rsmd.getColumnCount();
		fieldNames = new String[colCount];
		for (int i = 0; i < colCount; i++) {
			fieldNames[i] = rsmd.getCatalogName(i + 1);
		}

	}

	public int getRows() {
		try {
			rs.last();
			return rs.getRow();
		} catch (Exception e) {
			System.out.println(e);
			return 0;
		}
	}

	public int getCols() {
		return fieldNames.length;
	}

	public String[] getHeader() {
		return fieldNames;
	}

	public String getData(int row, int col) {
		try {
			rs.absolute(row);
			String data = rs.getString(col);
			return data;
		} catch (Exception e) {
			System.out.printf("%d : %d : %s\n", row, col, e.toString());
			return null;
		}
	}

	public void setData(int row, int col, String data) {
		try {
			rs.absolute(row);
			rs.updateString(col, data);
			rs.updateRow();
		} catch (Exception e) {
			System.out.printf("%d : %d : %s\n", row, col, e.toString());
		}
	}

	public void delData(int row) {
		try {
			rs.absolute(row);
			rs.deleteRow();
		} catch (Exception e) {
			System.out.printf("%d : %s\n", row, e.toString());
		}
	}

	public void addData() {
		try {
			rs.moveToInsertRow();
			rs.updateString("title", "");
			rs.updateString("author", "");
			rs.updateString("publisher", "");
			rs.updateString("date", "yyyy-mm-dd");
			rs.updateInt("class", 0);
			rs.insertRow();
			System.out.println("insert");
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
