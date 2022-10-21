package tw.atguigu.code;

/*
 對第一個java程式總結:
 
 1.java程式編寫-編譯-執行的過程
 	編寫:將編寫的code保存在".java"結尾的檔案中
 	編譯:使用javac.exe命令編譯java檔案，格式: javac 檔名: .java
 	執行:使用javac.exe命令解釋執行code，格式:java 類別名稱
 
 2.
 	在一個java中可以coding多個class，但是最多只能有一個class聲明為public
 	而且聲明為public的class名稱需與檔名相同
 
 3.程序執行進入點為main()方法，格式是固定的
 
 4.輸出語句:
 	System.out.println():先輸出資料，然後換行
 	System.out.print():只輸出資料，不換行
 
 5.每一行執行語句都以 ; 結束
 
 6.編譯的過程:編譯後，會生成一個或多個class檔案(看java中有幾個class就會生成幾個class檔)。class檔案名稱和java檔案名稱相同
 	
 */

public class day01_02_Hello {

	public static void main(String[] args) { // argument:參數
//	public static void main(String a[]) { // argument可改名 ex.改成 a、[]可換位置
		System.out.print("Hello World!");
		System.out.println(); // 換行
		System.out.println("Hello World!");
	}

}

class Person{
	
}

class Animal{
	
}
