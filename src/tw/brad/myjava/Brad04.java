package tw.brad.myjava;

import java.util.Scanner;

public class Brad04 {

	public static void main(String[] args) {
		
			// 需要一個Scanner的物件，所以要做宣告，並用 System.in 輸入
			// 為什麼要有變數名稱，因為要供後面呼叫做使用
			Scanner scanner = new Scanner(System.in);
												// 產生新的 Scanner 物件
//			System.out.println("before");		// 測試上一個 code 有沒有錯誤
			
			System.out.print("X = ");
			int v1 = scanner.nextInt();	// 執行時，需要輸入數值才會做後續動作，若沒輸入值，則不會開始下一個動作
//			System.out.println("after");		// 測試上一個 code 有沒有錯誤
			
			System.out.print("Y = ");
			int v2 = scanner.nextInt();
			
			// %d 用於『int』的佔位符號
			System.out.printf("%d + %d = Brad\n", v1, v2);		// 上網了解 printf 的意思!!  (字串格式化)		
			System.out.println();

			
			int result1 = v1 + v2;
			int result2 = v1 - v2;
			int result3 = v1 * v2;
			int result4 = v1 / v2;
			int result5 = v1 % v2;

			System.out.printf("%d + %d = %d\n", v1, v2, result1);		// 上網了解 printf 的意思!!  (字串格式化) // \n是換位的意思
			System.out.printf("%d - %d = %d\n", v1, v2, result2);	
			System.out.printf("%d * %d = %d\n", v1, v2, result3);	
			System.out.printf("%d / %d = %d\n", v1, v2, result4);	
//			System.out.printf("%d % %d = %d\n", v1, v2, result5);		// 執行後 % 會顯示錯誤訊息，語法上是對的，但是邏輯上是錯的
			System.out.printf("%d %% %d = %d\n", v1, v2, result5);		// %% 才會正確輸出， 寫兩次%有點像是跳脫字元的意思

			
		
	}

}
