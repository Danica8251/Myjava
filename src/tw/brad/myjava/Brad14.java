package tw.brad.myjava;

public class Brad14 {

	public static void main(String[] args) {
		int a = 10, b = 3;
		
//		System.out.println(++a);		// 11
//		System.out.println(a);			// 11
//		System.out.println(--b);		// 2
//		System.out.println(b);			// 2
		
		/* 執行後數值跟上面不一樣，要理解，基本觀念很重要 */
//		System.out.println(a++);		// 10
//		System.out.println(a);			// 11
//		System.out.println(b--);		// 3
//		System.out.println(b);			// 2
		
		
//		if (a++ > 10 && b-- < 3) {
//			System.out.printf("OK: a = %d, b = %d", a, b);		// a>10 不成立，不用運算到 b，故之後 a 才加 1，b 不運算維持原值
//		}else {
//			System.out.printf("XX: a = %d, b = %d", a, b);		// XX: a = 11, b = 3 
//		}

		
//		if (a++ > 10 || b-- < 3) {
//		System.out.printf("OK: a = %d, b = %d", a, b);		// a > 10 不成立 或 b < 3 不成立，故之後 a 才加 1 和 b 才減 1
//	}else {
//		System.out.printf("XX: a = %d, b = %d", a, b);		// XX: a = 11, b = 2
//	}

	
//	if (++a > 10 && --b < 3) {
//		System.out.printf("OK: a = %d, b = %d", a, b);		// a 先加 1 和 b 先減 1，輸出 OK: a = 11, b = 2，
//	}else {
//		System.out.printf("XX: a = %d, b = %d", a, b);
//	}

		
//		if (++a > 10 || --b < 3) {
//		System.out.printf("OK: a = %d, b = %d", a, b);		// a 先加 1 成立，故直接輸出 OK: a = 11, b = 3，b 不運算維持原值
//	}else {
//		System.out.printf("XX: a = %d, b = %d", a, b);
//	}
		
	}

}
