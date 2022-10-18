package tw.brad.myjava;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Brad17 {

	public static void main(String[] args) {
		
		// for 敘述句不一定是用在迴圈，只是大部分多用在迴圈
		
		// 宣告在哪裡，就活在哪裡：宣告在 A 敘述句裡，就活在 A 敘述句裡
		for (int i = 1;i <= 7; i ++) {
			// int i = 1：第一道敘述句
			// i <= 7：第二道敘述句，只會是布林值，如果為 true 則會執行
			System.out.println(i);
		}
		
		int a = 1;
		for (printBrad(); a <= 7 ; printLine()) {
			System.out.println(a++);
		}
		System.out.println("=> "+ a);
	}
		
		static void printBrad() {
			System.out.println("Brad");
		}
		
		static void printLine() {
			System.out.println("-------------------------");
		}
		
		
//		System.out.println(1);
//		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		System.out.println(6);		
}
