package tw.brad.myjava;

public class Brad03 {

	public static void main(String[] args) {

		byte a = 10, b = 3;		
		// 同型別可以寫在同一列
		// 有給值，就是完成初始化的意思，可以被存取，沒給值就只是宣告尚未初始化，沒辦法印出
		
		System.out.println(a);
		System.out.println(b);
		
		int c;
		c = a + b; // + 給完是int，不會是byte，會出現錯誤訊息，所以c的型別要改成int
		System.out.println(c);

		
	}

}
