/*
練習題: 接收用戶輸入的3個整數,並將它們的最大值作為結果輸出
 */

package tw.online.test;

import java.util.Scanner;

public class test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 提示並接收用戶輸入的3個數字，並命名 a b c 來保存
		System.out.println("請輸入第一個數字：");
		int a = new Scanner(System.in).nextInt();
		System.out.println("請輸入第二個數字：");
		int b = new Scanner(System.in).nextInt();
		System.out.println("請輸入第三個數字：");
		int c = new Scanner(System.in).nextInt();
		
		// 對接收到的三個整數做比較
		int max = a > b ? a : b;
		max = max > c ? max : c;
		
		//輸出
		System.out.println("三個整數的最大值為"+max);
		
		

	}

}
