package tw.brad.myjava;

import java.io.File;

public class Brad47 {

	public static void main(String[] args) {
		File f1 = new File("d:/test/ookk");
		if (f1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			f1.mkdir(); // 新增資料夾或檔案
		}
		System.out.println("---");
		
//		File here = new File("."); // . 表示本路徑
//		System.out.println(here.getAbsolutePath());
		
		File dir1 = new File("./dir1"); //表示本路徑底下的dir1
		if (dir1.exists()) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
			dir1.mkdir(); // 新增資料夾或檔案
		}
	}
}
