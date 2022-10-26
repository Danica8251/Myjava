package tw.brad.myjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/*
 * 拿頁面原始碼資料(文字資料) - Json資料
 * */

public class Brad71 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://data.coa.gov.tw/Service/OpenData/ODwsv/ODwsvMovingRoad.aspx");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			
			conn.connect();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String line; StringBuffer sb = new StringBuffer();
			while ((line = reader.readLine()) != null) {
				sb.append(line);
			}
			reader.close();
			
			System.out.println(sb.toString());
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// 解析資料
	static void parseJSON(String json) {
		
	}

}
