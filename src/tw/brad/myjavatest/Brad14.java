package tw.brad.myjavatest;

public class Brad14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 8, b = 2;
		
//		System.out.println(++a);		// 9
//		System.out.println(a);			// 9
//		System.out.println(--b);		// 1
//		System.out.println(b);			// 1
		
//		System.out.println(a++);		// 8
//		System.out.println(a);			// 9
//		System.out.println(b--);		// 2
//		System.out.println(b);			// 1
		
//		if (a++ > 8 && b-- < 2) {
//			System.out.printf("OK: a = %d, b = %d", a, b);
//		}else {
//			System.out.printf("XX: a = %d, b = %d", a, b);
//		}
//		// 輸出 XX: a = 9, b = 2
		
//		if (a++ > 8 || b-- < 2) {
//			System.out.printf("OK: a = %d, b = %d", a, b);
//		}else {
//			System.out.printf("XX: a = %d, b = %d", a, b);
//		}
//		// 輸出 XX: a = 9, b = 1
		
//		if (++a > 8 && --b < 2) {
//		System.out.printf("OK: a = %d, b = %d", a, b);
//	}else {
//		System.out.printf("XX: a = %d, b = %d", a, b);
//	}
//	// 輸出 OK: a = 9, b = 1
		
		if (++a > 8 || --b < 2) {
		System.out.printf("OK: a = %d, b = %d", a, b);
	}else {
		System.out.printf("XX: a = %d, b = %d", a, b);
	}
	// 輸出 OK: a = 9, b = 2
		
	}

}
