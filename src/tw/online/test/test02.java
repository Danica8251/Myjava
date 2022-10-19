/*
練習題：打印個人信息案例，將一個人的一些個人信息打印輸出
 */

// 2022/10/13 練習OK

package tw.online.test;

public class test02 {

	public static void main(String[] args) {
		
		String name = "海綿寶寶";
		int year = 3;
		String home = "海底";
		
		double redbag = 10.99;
		
		System.out.println("海綿寶寶");		//字串型別，我是海綿寶寶
		System.out.println(3);						//整數型別，今年3歲了
		System.out.println("海底");				//字串型別，我的家在海底
		System.out.println(true);					//布林型別，吃飯了嗎?已經吃了
		System.out.println(10.99);				//浮點數型別，今天收到10.99的紅包
		
		System.out.println("我是"+name+"，今年"+year+"歲了，我的家在"+home+"，吃飯了嗎?"+true+"，今天收到"+redbag+"的紅包");
		
	}

}
