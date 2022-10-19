package tw.brad.myjava;

import tw.brad.myclass.Bike;

public class Brad32 {

	public static void main(String[] args) { // 程式執行進入點
		
		Brad321 obj1 = new Brad321(); // new 新的
		Brad321 obj2 = new Brad321(); // new 另外一個新的，不同的
		Brad321 obj3 = obj1; // 與 obj1 同一個
		if (obj1.equals(obj2)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		if (obj1.equals(obj3)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println(obj1); // tw.brad.myjava.Brad321@372f7a8d => 這個類別在(@)372f7a8d的記憶體位置
		System.out.println(obj2); // tw.brad.myjava.Brad321@2f92e0f4
		System.out.println(obj3); // tw.brad.myjava.Brad321@372f7a8d
		
		System.out.println(obj1 == obj2); // false XX
		System.out.println(obj1 == obj3); // true  OK
		/* equals 跟 == 比較結果一樣 */
		
		System.out.println("---");
		String s1 = "Brad";
		String s2 = "Brad";
		String s3 = new String("Brad");
		String s4 = new String("Brad");
		System.out.println(s1 == s2); // true，如果是物件，比的是位置
		System.out.println(s1 == s3); // false
		System.out.println(s2 == s4); // false
		/* 此時此刻共有三個物件實體：s1=s2、s3、s4 */
		System.out.println("---");
		
		System.out.println(s1.equals(s2)); // true
		System.out.println(s1.equals(s3)); // true
		System.out.println(s1.equals(s4)); // true
		System.out.println(s2.equals(s3)); // true
		System.out.println(s2.equals(s4)); // true
		System.out.println(s3.equals(s4)); // true
		
		System.out.println("---");
		StringBuffer sb1 = new StringBuffer("Brad");
		StringBuffer sb2 = new StringBuffer("Brad");
		System.out.println(sb1 == sb2); // false
		System.out.println(sb1.equals(sb2)); // false
		
		System.out.println("---");
		Bike b1 = new Bike();
		Bike b2 = new Bike();
		System.out.println(b1); // tw.brad.myclass.Bike@5305068a
		System.out.println(b2); // tw.brad.myclass.Bike@1f32e575
		System.out.println(b1.toString()); // tw.brad.myclass.Bike@5305068a
		System.out.println(sb1); // Brad，有改寫成字串
		



		
		
	}
}

class Brad321{
	
}
