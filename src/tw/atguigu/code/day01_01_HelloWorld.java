package tw.atguigu.code;

/*
 1.java規範的三種注釋方式
 	單行注釋
 	多行注釋
 	文檔注釋(java特有)
 	
 2.
 	單行注釋和多行注釋的作用:
 	(1)對所寫的程序進行解釋說明，增強可讀性，方便自己、方便別人
 	(2)調適所寫的代碼
 	
 3.特點:單行注釋和多行注釋，注釋的內容不參與編譯，就是編譯後生成的.class文件不包含注釋掉的訊息
 
 4.文檔注釋的使用:
 	注釋內容可以被javadoc所解析，生成一套以網頁形式表現的說明文檔
 
 5.多行注釋"內"無法再多行注釋
 
 */

/**
 * 文檔注釋
 * @author danic
 * @version v1.0
 * 這是我的第一個java程式!
 *
 */

public class day01_01_HelloWorld {
	
	/*
	 多行注釋:
	 如下的main方法是程序的入口
	 main的格式是固定的 
	 */
	
	/**
	 如下的方法是main()，作用是:程式執行進入點
	 */
	
	public static void main(String[] args) {
		// 單行注釋：如下的語句表示輸出到控制台
		System.out.println("Hello World!");
	}

}
