package tw.brad.myjava;

public class Brad22 {

	public static void main(String[] args) {
		// 陣列用線性觀念(樹狀圖)
		int[][] a = new int[3][];
		a[0] = new int[2];	// 若宣告型別為int，則只能用整數，不能使用字串
		a[1] = new int[3];
		a[2] = new int[4];
		
		a[0][1] = 123;
		a[1][2] = 333;
		a[2][1] = 121;
		
		for (int i=0; i<a[2].length; i++) {
			System.out.println(a[2][i]);
		}
		
		System.out.println("---");
		
		// for-each
		for (int v : a[2]) {
			System.out.println(v);
		}
		
		System.out.println("---");
		
		// for-each
		for(int[] v : a) {
			for (int vv : v) {
				System.out.print(vv + "  ");
			}
			System.out.println();
		}
		
	}

}
