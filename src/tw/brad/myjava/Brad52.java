package tw.brad.myjava;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 檔案不存在，新增檔案及內容;
 * 檔案存在，複寫內容
 * */

public class Brad52 {

	public static void main(String[] args) {
		String source = "dir1/file1.txt";
		String target = "dir1/file2.txt";
		long start = System.currentTimeMillis();
		try {
			FileOutputStream fout = new FileOutputStream(target);
			
			FileInputStream fIn = new FileInputStream(source);
			int c;
			while ((c = fIn.read()) != -1) {
				fout.write(c);
			}
			fIn.close();
			
			fout.flush();
			fout.close();
			System.out.println("Sava as ... OK" + (System.currentTimeMillis()- start));
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
