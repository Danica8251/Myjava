package tw.brad.myjava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Brad48 {
	public static void main(String[] args) {
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("dir1/file1.txt");
//			int c1 = fin.read();
//			System.out.println((char)c1);
//			
//			int c2 = fin.read();
//			System.out.println((char)c2);
			
			int c1;
			while ((c1 = fin.read()) != -1) {
				System.out.print((char)c1);
			}
			
			fin.close();
			System.out.println("OK");
		}catch (Exception fe) {
			System.out.println("XX");
//		}catch (FileNotFoundException fe) {
//			System.out.println("XX2");
//		}catch (IOException fe) {
//			System.out.println("XX1");
//		}
			
//			// 驗證過程
//			if(fin == null && fin instanceof FileInputStream) {
//				System.out.println("is null");
//			}else {
//				System.out.println("not null");
//			}	
		}
	}

}
