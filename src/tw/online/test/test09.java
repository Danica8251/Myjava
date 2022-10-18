/*
  练习题：接收用户输入的数据，判断是奇数还是偶数
  */

package tw.online.test;

import java.util.Scanner;

public class test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 提示並接收用戶輸入的數據
		System.out.println("請輸入您要判斷的數據：");
		int data = new Scanner(System.in).nextInt();
		
		// 判斷用戶數據 if else
		if (data % 2 == 0) {
			System.out.println(data + "是偶數");
		}else {
			System.out.println(data + "是奇數");
		}

	}

}
