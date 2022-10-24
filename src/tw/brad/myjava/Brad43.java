package tw.brad.myjava;

public class Brad43 {
	
	/*
	 * try-catch 例外處理
	 */

	public static void main(String[] args) {
		
		int a = 10, b = 3;
		int c;
		int[] d = {1,2,3,4};
		try {
			c = a / b;
			System.out.println(c);
			System.out.println(d[4]);
		}catch (ArithmeticException ae) { // 數學例外
			System.out.println("XX");
		}catch (ArrayIndexOutOfBoundsException ie) { // ArrayIndex超出範圍
			System.out.println("XX2");
		}catch (RuntimeException re) { // 除了數學例外及ArrayIndex超出範圍外的例外 // 如有Runtime跟其他例外的話，Runtime放最後，順序不能變動
			 System.out.println("XX3");
		}
		System.out.println("OK");
	}

}
