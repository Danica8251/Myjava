/*
练习题：求数字的绝对值
绝对值是指一个数在数轴上所对应点到原点的距离，用“| |”来表示。
负数的绝对值是他去掉负号以后的值，而非负数（0和正数）的绝对值是他本身。
请定义一个方法，接收用户输入的数字，输出绝对值结果。
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
