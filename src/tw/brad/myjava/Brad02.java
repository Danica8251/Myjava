package tw.brad.myjava;

public class Brad02 {

	public static void main(String[] args) {
			// 整數 byte：2^8, short：2^16, int：2^32, long：2^64，差別在記憶體大小
			// 重要度(常用)：int > byte > shot=long
			// 強型別的語言，一定要宣告，宣告後就無法改變
			byte var1; 			// 這樣就叫做宣告  // 2^8 => 256 => -128 ~ 127
			byte Var1;			// 跟上面是不同東西，左邊黃燈是警告訊息，但還是可以編譯
										// 命名規則：[a-zA-Z$_] 都可以當第一個字母 + [a-zA-Z0-9$_]可當後續的字母 + no keyword
			var1 = 123; Var1=-123;		//可以命名完後再給值
			byte $$$;			//$ 跟 _ 建議特別時候再用
			byte $_$ = 27;	//命名同時可以直接給值
			$$$ = -1;	//值的部分為int
			System.out.println(var1);
			System.out.println(Var1);
			System.out.println($$$);
			System.out.println($_$);
			
	}

}
