/* 包含抽象方法、抽象類別、override、多型 */

package tw.brad.myjava;

public class Brad34 {

	public static void main(String[] args) {
		
//		Brad341 obj1 = new Brad341(); // 抽象方法無法使用此code；抽象類別無法直接建構出物件實體，但抽象類別還是會有建構式
		
		Brad341 obj1 = new Brad342();
		Brad342 obj2 = new Brad342();
		
	}

}


// 沒有存取修飾字的類別
//class Brad341{ // 使用抽象方法，前面要加 abstract
abstract class Brad341{
	void m1() {System.out.println("Brad341:m1()");} /* 怪物有很多相同的功能 */
//	void m2(); // ( )參數應該要有，但是卻不實作，並期待子類別去做不同變化，此時會是錯誤訊息，故要用抽象方法
	abstract void m2(int a); // 沒有完成實作的抽象方法 /* 有自己特殊的功能 ex.發射子彈 */
	
//	abstract String m3(String a); // 沒有完成實作的抽象方法
//	abstract String m3(Object a); // 沒有完成實作的抽象方法
	abstract protected Object m3(Object a); // protected 可以對外使用

	abstract void m4(); // 沒有完成實作的抽象方法 // 抽象方法強迫多型
}

// Brad342 繼承 Brad341
class Brad342 extends Brad341{
	void m2(int b) {} // 原341的m2為抽象方法，342繼承341並加上{ }就是有實作
	void m2() {} // 原341的m2為抽象方法，342繼承341並加上{ }就是有實作
	
//	String m3(Object a) {} // 原341的m3為String，342的m3為Object，會出現錯誤訊息；若341的m3為Object，342的m3為String，則會正常執行(String is a Object => 繼承觀念)
//	String m3(Object a) {return null;}  // 基本型別的傳回值要一模一樣
	public StringBuffer m3(Object a) {return null;} // 對外使用 => public
	
	void m4() {} // 原341的m4為抽象方法，342繼承341並加上{ }就是有實作
}

//class Brad343 extends Brad341{
//	void m2(int c) {} // 原341的m2為抽象方法，343繼承341並加上{ }就是有實作
//	void m3() {}
//	void m4() {}
//}