/*
練習題：邏輯判斷
已知小紅同學有25元，她攢了幾天錢之後發現自己的現在的錢比原來的2倍還多出10塊。
而小藍同學有30元，他攢了幾天錢之後發現自己的錢正好是原來的2倍。
於是小胖說：小紅和小藍現在的錢一樣多，請問，他說的對嗎？
 */

// 2022/10/13 練習OK

package tw.online.test;

public class test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//原有金額
		int red = 25;
		int blue = 30;
		
		//增加金額
		red = red * 2 + 10;
		blue = blue * 2;
		
		System.out.println(red == blue);
		
	}

}
