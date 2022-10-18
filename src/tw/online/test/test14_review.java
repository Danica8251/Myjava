/*
练习题：求指定两个数的最大公约数和最小公倍数
  */

package tw.online.test;

import java.util.Scanner;

public class test14_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 提示並接收兩個整數
		System.out.println("請輸入兩個整數：");
		int a = new Scanner(System.in).nextInt();
		int b = new Scanner(System.in).nextInt();
		
		int c = zdgys(a, b);					// 求最大公約數的方法
		long d = zxgbs(a,b);				// 求最小公倍數的方法
		System.out.println("最大公約數：" + c);
		System.out.println("最小公倍數：" + d);

	}

	private static int zdgys(int a, int b) {
		// TODO Auto-generated method stub
		
		int min = a < b ? a : b;
		for (int i = min; i >= 1; i--) {
			// i能把a和b同時整除
			if (a % i == 0 && b % i == 0) {
				return i;
			}
		}
		// 這句 code 根本不會執行，只是讓編譯可以通過
		return 0;
	}
	
	private static long zxgbs(int a, int b) {
		// TODO Auto-generated method stub
		
		int max = a > b ? a : b;
		for (long i = max; ; i += max) {
			// i能同時被a和b整除
			if (i % a == 0 && i % b ==0) {
				return i;
			}
		}
	}
	
}
