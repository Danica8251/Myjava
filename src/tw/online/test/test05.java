/*
練習題：預測身高案例：
其實我們可以通過父母的身高大致推斷出子女的身高，假定父母與子女的身高遺傳關係如下：
​兒子身高（厘米）＝(父親身高＋母親身高) ×1.08÷2
​女兒身高（厘米）＝(父親身高×0.923＋母親身高) ÷2
那已知：現有父親身高175CM,母親身高160CM。
請將預測的子女身高打印輸出
 */

// 2022/10/13 練習OK

package tw.online.test;

public class test05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double fatherHeight = 175;
		double motherHeight = 160;
		double sonHeight = (fatherHeight+motherHeight)*1.08/2;
		double daugherHeight = (fatherHeight*0.923+motherHeight)/2;
		
		System.out.println("預測兒子身高為"+sonHeight+"公分");
		System.out.println("預測女兒身高為"+daugherHeight+"公分");
		
	}

}
