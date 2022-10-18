package tw.brad.myjava;

public class Brad13 {

	/*
	閏年規則
	公元年分非4的倍數，為平年。
	公元年分為4的倍數但非100的倍數，為閏年。
	公元年分為100的倍數但非400的倍數，為平年。
	公元年分為400的倍數為閏年。
	 */
	public static void main(String[] args) {
		int year = 2022;
		
		/* 第一種寫法 */
		if (year % 4 == 0) {
			if (year / 100 != 0) {
				System.out.println("閏年");
			}else {
				if (year / 400 ==0) {
					System.out.println("閏年");
				}else {
					System.out.println("平年");
				}
			}
		}else {
		System.out.println("平年");
		}
		
		/* 第二種寫法 */
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("閏年");
				}else {
					System.out.println("平年");
				}
			}else {
				System.out.println("閏年");
			}
		}else {
			System.out.println("平年");
		}
		
		/* 第三種寫法 */
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			// 閏
			System.out.println("閏年");
		}else {
			// 平
			System.out.println("平年");
		}

		
	}

}
