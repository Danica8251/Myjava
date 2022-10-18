package tw.brad.myjava;

import javax.swing.JFrame;

public class Brad26 {

	public static void main(String[] args) {	// 程式執行進入點
		
		// 寫在方法中的是區域變數
		
		JFrame f1 = new JFrame();	// 創了一個 JFrame (視窗)的物件實體
		f1.setSize(640, 480);	// 寬,高
		f1.setVisible(true);	// 執行時要看得到
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	 // 預設關閉方法(視窗關閉時，執行也會同時關閉)
		f1.setTitle("I am f1");
		
		JFrame f2 = new JFrame();
		f2.setSize(640, 480);	// 寬,高
		f2.setVisible(true);	// 執行時要看得到
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setTitle("I am f2");

		
		
		
	}

}
