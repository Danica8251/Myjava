package tw.brad.myjava;

public class Brad18 {

	public static void main(String[] args) {
		
		// 陣列 Array
		int b;
		b = 3;
		int[] a;	// 此行為整數陣列的宣告
		a = new int[3];		// 總共可以存放 3 個整數值
		System.out.println(a[0]);	// [0]	偏移量=0
		System.out.println(a[1]);	// [1]	偏移量=1
		System.out.println(a[2]);	// [2]	偏移量=2
//		System.out.println(a[3000]);	// 編譯成功(只要數值是在int原始範圍裡面就不會出現錯誤訊息)，但執行會出現錯誤訊息
		
		System.out.println("---");
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("---");
		a[2] = 123; a[1] = 777;	
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		
	}

}
