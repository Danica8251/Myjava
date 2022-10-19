/*
練習題：拼接打印：輸出：XXX：這是我學習JAVA的第X年，我的期望薪資是XXX
 */

// 2022/10/13 練習OK

package tw.online.test;

public class test03 {
	
	public static void main (String[] args) {
		
		String name = "派大星";		//字串型別，名字
		int year = 1;								//整數型別，學習的第X年
		double salary = 40000.0;		//浮點樹型別，期望薪資
		
		System.out.println(name+"：這是我學習JAVA的第"+year+"年，我的期望薪資是"+salary);
		
	}

}
