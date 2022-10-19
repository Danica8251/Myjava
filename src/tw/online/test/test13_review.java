/*
練習題：求數字的絕對值
絕對值是指一個數在數軸上所對應點到原點的距離，用“| |”來表示。
負數的絕對值是他去掉負號以後的值，而非負數（0和正數）的絕對值是他本身。
請定義一個方法，接收用戶輸入的數字，輸出絕對值結果。
 */

// ★尚未理解

package tw.online.test;

import java.util.Scanner;

public class test13_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 接收輸入的數字
		System.out.println("請輸入數字：");
		double input = new Scanner(System.in).nextDouble();
		
		// 使用計算絕對值的方法並拿到運算後的結果(返回值)
		double result = getAbsNum(input);
		
		// 輸出運算後的結果
		System.out.println(input + "的絕對值是" + result);

	}

	private static double getAbsNum(double input) {
		// TODO Auto-generated method stub
		if (input >= 0) {		// 如果是非負數
			return input;		// 返回本身的值
		}else {							// 如果是負數
			return -input;		// 則值取反
		}
	}

}
