package tw.atguigu.code;

/*
 變數的使用
 1.java定義變數的格式: 型態 變數名 = 變數值; ex. int a = 1;
 
 2.說明:
 	(1)變數必須先聲明，後使用
 	(2)變數定義在{}內。在{}內是有效的;{}外無效
 	(3)同一個{}內，不可以聲明兩個相同的變數名
 
 */

public class day02_02_VariableTest {

	public static void main(String[] args) {
		// 變數的定義
		int myAge = 12;
		// 變數的使用
		System.out.println(myAge);
		
		// 編譯錯誤=>使用myNumber之前並未定義過myNumber
//		System.out.println(myNumber);

		
		// 變數的聲明
		int myNumber;
		
		// 編譯錯誤=>尚未給值
//		System.out.println(myNumber);

		
		// 變數的給值
		myNumber = 1001;
		
		System.out.println(myNumber);
		
		// 編譯不通過
//		System.out.println(myClass);
		
		//不可以在同一個{}內定義相同變數名
//		int myAge = 22;
		
	}
	
	public void method() {
		int myClass = 1;
	}

}

//class VariableTest{} // 逆向思維，反證法
 