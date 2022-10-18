package tw.brad.myjava;

public class Brad29 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		System.out.printf("a = %d, b = %d", a, b);
		
		System.out.println("---");
		
		// 兩個數互換 寫法一
//		int c = a;
//		a = b;
//		b = c;
//		System.out.printf("a = %d, b = %d", a, b);
		
		// 兩個數互換 寫法二
		a = a + b; // a = 13
		b = a - b; // b = 10
		a = a - b; // a = 3
		System.out.printf("a = %d, b = %d", a, b);
	}

}
