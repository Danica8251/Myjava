/*
练习题：最优选择
某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，米饭单点3元。
订单满30元8折优惠。鱼香肉丝优惠价16元，但是优惠价和折扣不能同时使用。
那么这个小伙要点这三样东西，最少要花多少钱？

提示：使用 三元運算子 ? :
			a ? b : c =>如果條件 a 為 true，執行運算式 b ；如果條件 a 為 false，則執行運算式 c
  */

// 2022/10/13 練習OK

package tw.online.test;

public class test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 求不使用優惠的總價
		double money1 = 24 + 8 + 3;	
		
		// 判斷折扣後總價，使用到三元運算
		money1 = (money1 <= 30 ? money1 : money1 * 0.8);	// 若小於30，執行money1；若大於30，執行money1*0.8
		
		// 求使用優惠的總價
		double money2 = 16 + 8 + 3;
		
		// 判斷哪個花費最少
		double money = money1 < money2 ? money1 : money2;	//若money1小於money2，執行money1；反之，執行money2
		
		// 印出最後花費
		System.out.println(money);
		
	}

}
