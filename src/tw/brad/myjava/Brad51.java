package tw.brad.myjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 檔案不存在，新增檔案及內容;
 * 檔案存在，複寫內容
 * */

public class Brad51 {

	public static void main(String[] args) {
		String data = "Brad\n";
		try {
		FileOutputStream fout = new FileOutputStream("dir1/file2.txt", true);
		fout.write(data.getBytes()); // 字串轉陣列
		fout.flush();
		fout.close();
		System.out.println("OK");
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
	}

}
