package tw.atguigu.code;

/*
 Java定義的型別
 
 一、變數名按照型別區分:
 
 基本型別:
 	整數:byte / short / int / long
	浮點數:float / double
	布林:boolean
	字元:char
	
 引用型別:
 	類別(class)
 	介面(interface)
 	陣列(array)
 	
 二、變數名在類別中的位置:
 	實體變數 vs 區域變數
 
 */

public class day02_03_VariableTest {

	public static void main(String[] args) {
		
	 	// 1.整數:byte / short / int / long
		
		// (1)byte範圍:-128 ~ 127
		byte b1 = 12;
		byte b2 = -128;
//		b2 = 128; // 編譯不通過
		System.out.println(b1);
		System.out.println(b2);
		
		// (2)聲明long型態的變數，必須以"l"或"L"結尾
		// (3)通常，定義整數變數時，使用int型態
		short s1 = 128;
		int i1 = 1234;
		long l1 = 324439;
		System.out.println(l1);
		
		// 2.浮點數:float / double
		// (1)浮點數:帶小數點的數值
		// (2)float:數值的範圍比long還大
		
		double d1 = 123.3;
		System.out.println(d1 + 1);
		
		// (3)定義float型態變數時，變數要以"f"或"F"結尾
		float f1 = 12.3F;
		System.out.println(f1);
		// (4)定義浮點數型別的變數時，大多使用double型態
		
		// 3.字元型別:char型態
		// (1)char型態的變數，通常使用一對''，內部只能寫一個字元
		char c1 = 'a';
		//編譯不通過
//		c1 = 'AB';
		System.out.println(c1);
		
		char c2 = '1';
		char c3 = '中';
		char c4 = 'd';
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		
		//(2)表示方式: 1.聲明一個字元 2.忽略字元 3.直接使用Unicode值來表示字元常數
		char c5 = '\n'; // 換行
		c5 = '\t'; //跳格(tab)
		System.out.println("hello" + c5);
		System.out.println("world");
		
		char c6 = '\u0123';
		System.out.println(c6);
		

		

		
	}

}
