/*
練習題：銀行收入計算
某銀行推出了整存整取定期儲蓄業務，其存期分為一年、兩年、三年、五年，到期憑存單支取本息。存款年利率表如下：
​存期年利率（%）
​ 一年2.25
​ 兩年2.7
​ 三年3.25
​ 五年3.6
請存入一定金額（1000起存），存一定年限（四選一），計算到期後得到的本息總額。
提示：
​存入金額和存入年限均由鍵盤錄入
​本息計算方式：本金+本金×年利率×年限
 */

package tw.online.test;

import java.util.Scanner;

public class test15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("請輸入本金金額(1000元起存)：");
		int money = new Scanner(System.in).nextInt();
		
		System.out.println("請輸入年限：");
		int year = new Scanner(System.in).nextInt();
		
		double outmoney = 0;
		
		if (year == 1) {
			outmoney = money + money * 0.0225 * year;
		}else if (year == 2) {
			outmoney = money + money * 0.027 * year;
		}else if (year == 3) {
			outmoney = money + money * 0.0325 * year;
		}else if (year == 5) {
			outmoney = money + money * 0.036 * year;
		}else {
			System.out.println("輸入的年限有誤");
		}
		
		System.out.println("存款" + year + "年後的本息有" + (int)outmoney + "元");
		
	}

}
