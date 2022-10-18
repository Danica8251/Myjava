/*
练习题: BMI 指数测试 BMI = 体重 (kg) / 身高² (m)
接收用户输入的身高和体重,将判断结果输出
过轻：低于18.5
正常：18.5 ~ 22.9
偏胖：23 ~ 24.9
肥胖：25 ~ 29.9
重度肥胖：高于30
极度肥胖：高于40
  */

package tw.online.test;

import java.util.Scanner;

public class test11_review {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 提示並接收資料
		System.out.println("請輸入身高(單位為 m)：");
		double height = new Scanner(System.in).nextDouble();
		System.out.println("請輸入體重(單位為 kg)：");
		double weight = new Scanner(System.in).nextDouble();
		
		// 計算 BMI
		double bmi = weight / (height * height);
		
		// 判斷 BMI 指數
		if (bmi < 18.5) {
			System.out.println("過輕：BMI 低於18.5");
		}else if ( bmi <= 22.9) {
			System.out.println("正常：BMI 18.5 ~ 22.9");
		}else if (bmi <= 24.9) {
			System.out.println("偏胖：BMI 23 ~ 24.9");
		}else if (bmi <= 29.9) {
			System.out.println("肥胖：BMI 25 ~ 29.9");
		}else if (bmi > 30) {
			System.out.println("重度肥胖：BMI 高於30");
		}else {
			System.out.println("極度肥胖：BMI 高於40");
		}
		
		/* 詳解 */
		
		// 提示並接收資料
		System.out.println("請輸入身高(單位為 m)：");
		double height2 = new Scanner(System.in).nextDouble();
		System.out.println("請輸入體重(單位為 kg)：");
		double weight2 = new Scanner(System.in).nextDouble();
		
		// 使用 getBMI()方法，根據身高和體重資料，輸出結果
		getBMI(height2, weight2);
		
	}

	private static void getBMI(double h, double w) {
		// TODO Auto-generated method stub
		
		// 計算BMI指數
		double bmi2 = w / (h * h);
		
		// 定義一個變數r來保存最終結果
		String r = "";
		
		// 判斷BMI指數
		if (bmi2 < 18.5) {
			r = "過輕：BMI 低於18.5";
		}else if ( bmi2 <= 22.9) {
			r = "正常：BMI 18.5 ~ 22.9";
		}else if (bmi2 <= 24.9) {
			r = "偏胖：BMI 23 ~ 24.9";
		}else if (bmi2 <= 29.9) {
			r = "肥胖：BMI 25 ~ 29.9";
		}else if (bmi2 > 30) {
			r = "重度肥胖：BMI 高於30";
		}else {
			r = "極度肥胖：BMI 高於40";
		}
		
		// 印出最終結果
		System.out.println("您的BMI指數為" + bmi2);
		System.out.println("您的體重屬於" + r);
		
	}
	
	

}
