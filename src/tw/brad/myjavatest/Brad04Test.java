package tw.brad.myjavatest;

import java.util.Scanner;

public class Brad04Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 宣告 scanner 這個物件，並用 System.in 輸入
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("X = ");
		int v1 = scanner.nextInt();	// 執行時要輸入數值
		
		System.out.print("Y = ");
		int v2 = scanner.nextInt();	// 執行時要輸入數值
		
		int result1 = v1 + v2;
		int result2 = v1 - v2;
		int result3 = v1 * v2;
		int result4 = v1 / v2;
		int result5 = v1 % v2;
		
		System.out.printf("%d + %d = %d\n", v1, v2, result1);
		System.out.printf("%d - %d = %d\n", v1, v2, result2);
		System.out.printf("%d * %d = %d\n", v1, v2, result3);
		System.out.printf("%d / %d = %d\n", v1, v2, result4);
		System.out.printf("%d %% %d = %d\n", v1, v2, result5);
		
	}

}
