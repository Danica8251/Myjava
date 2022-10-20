package tw.brad.myjavatest;

public class Brad15Test {

	public static void main(String[] args) {
		
		// 1.宣告變數
		int a = 10;
		final int b = 3; // 加上final變成常數
		
		// switch-case用於比對整數、字元、Enum、字串，Enum
		switch (a) {
			case b: // a == b => 不符合，執行下一個
				System.out.println("A");
				break;
			case 10: // a = 10 => 符合，並遇到break跳出
				System.out.println("B");
				break; // 因符合陳述句故跳出，後續code不執行
			case 1000: // a = 1000
				System.out.println("C");
				break;
			default: // ≠a
				System.out.println("X");
				break;
		}
			System.out.println("End");	
	}

}
