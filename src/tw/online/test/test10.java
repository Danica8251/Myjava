/*
練習題：輸入數字1~7，輸出對應星期幾
 */

package tw.online.test;

import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 提示並接收輸入的資料
		System.out.println("請輸入資料：");
		int input = new Scanner(System.in).nextInt();
		
		// 判斷資料 if else if
		if (input == 1) {
			System.out.println(input + "是星期一");
		}else if(input == 2) {
			System.out.println(input + "是星期二");
		}else if (input == 3){
			System.out.println(input + "是星期三");
		}else if (input == 4) {
			System.out.println(input + "是星期四");
		}else if (input == 5) {
			System.out.println(input + "是星期五");
		}else if (input == 6) {
			System.out.println(input + "是星期六");
		}else if(input == 7) {
			System.out.println(input + "是星期日");
		}
		
	}
		
}

