package tw.brad.myjava;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

/*
 * 拿頁面原始碼資料(文字資料)
 * */

public class Brad68 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://www.iii.org.tw");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			
//			if (conn instanceof HttpsURLConnection) {
//				System.out.println("OK");
//			}
			
			conn.connect();
			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream())); // 串接的行為
			
			String line;
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
			reader.close();
			System.out.println("---");
			System.out.println("OK");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
