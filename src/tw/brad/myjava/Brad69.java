package tw.brad.myjava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.function.BinaryOperator;

import javax.net.ssl.HttpsURLConnection;

/*
 * 拿頁面原始碼資料
 * */

public class Brad69 {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://images.app.goo.gl/Tgcj5XSNbkxUfBou7");
			HttpsURLConnection conn = (HttpsURLConnection)url.openConnection();
			
//			if (conn instanceof HttpsURLConnection) {
//				System.out.println("OK");
//			}
			
			conn.connect();
			
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("dir1/new002.jpg"));
			
			BufferedInputStream bin = new BufferedInputStream(conn.getInputStream());
			
			int len; byte[] buf = new byte[16*1024];
			while ((len = bin.read(buf)) != -1) {
				bout.write(buf, 0, len);
			}
			
			bin.close();
			
			bout.flush();
			bout.close();
			
			
			System.out.println("---");
			System.out.println("OK");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
