package tw.brad.myjava;

public class Brad09 {

	public static void main(String[] args) {
		int a =10;
		System.out.println("before");
		if (a == 10) {		// 強型別語言不會有===這個出現
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
		System.out.println("after");
	}

}
