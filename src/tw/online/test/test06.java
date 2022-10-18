/*
练习题：逻辑判断
已知小红同学有25元，她攒了几天钱之后发现自己的现在的钱比原来的2倍还多出10块。
而小蓝同学有30元，他攒了几天钱之后发现自己的钱正好是原来的2倍。
于是小胖说：小红和小蓝现在的钱一样多，请问，他说的对吗？ 
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
