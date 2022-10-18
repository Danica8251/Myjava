package tw.brad.myjavatest;

public class Brad03Test {

	public static void main(String[] args) {
		byte a = 10, b = 3;
		System.out.println(a);
		System.out.println(b);
		
		int c;
		c = a + b;
		System.out.println(c);
		
		int d;
		d = a - b;
		System.out.println(d);
	}
}

/*
 * tw.brad.myjavatest 套件裡面，
 * 有一個 Brad03Test 類別，
 * 用 main 方法，
 * 宣告 byte 型別的 a、b 的變數，並給予值後印出，
 * 宣告 int 型別的 c、d 變數，型別不能用byte的原因是因為 +、- 的關係，
 * 只要是運算式，運算出來的值一定是 int，不會是 byte，
 * 如果使用 byte ，就會出現錯誤訊息。
 */