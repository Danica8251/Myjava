/*
练习题：预测身高案例：
其实我们可以通过父母的身高大致推断出子女的身高，假定父母与子女的身高遗传关系如下：
​儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
​女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
那已知：现有父亲身高175CM,母亲身高160CM。
请将预测的子女身高打印输出
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
