package tw.brad.myjava;

public class Brad15 {

	public static void main(String[] args) {	// 程式執行進入點
		// TODO Auto-generated method stub
		
//		byte a =1;
		int a = 10;
		final int b = 3;		// 加上 final，就是常數
		
		switch (a) {	// byte, short, int, char, String, enum
			case b:
				System.out.println("A");
				break;		// 脫離它所在的敘述區塊
			case 10:
				System.out.println("B");
//				break;
			default:		// default 不一定要放在最後，但是放最後看的時候比較好了解
				System.out.println("X");
				break;
			case 1000:
				System.out.println("C");
				break;
//			default:
//				System.out.println("X");
//				break;
		}
		System.out.println("End");
	}
}
