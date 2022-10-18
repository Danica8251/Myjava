package tw.brad.myjava;

import java.util.Random;

public class Brad10 {

	public static void main(String[] args) {
		// Score => 0 ~ 100 (int)
		/*
		double score = Math.random();		// 0.0 <= score < 1.0
		double score2 = score * 101;		// 0.0 <= score2 <101.0
		int score3 = (int)score2;		// 0 <= score3 <= 100
		*/
		
																		// 每次寫 code 如果有常數，都要知道常數代表的意義
		int score = (int)(Math.random() * 101);	// 101 代表用來產生 101 個整數值，0 ~ 100 總共有 101 個數字
		System.out.println(score);
		
		// Pass / Down
		if (score <= 60) {
			System.out.println("Pass");
		}else {
			System.out.println("Down");
		}
		
		//大樂透 1 ~ 49
		int bigscore = (int)(Math.random() * 49) + 1;		// 49 代表產生 49 個數字(0~49)，但需要的是1~49，右邊位移一個數字，故+1
		
	}

}
