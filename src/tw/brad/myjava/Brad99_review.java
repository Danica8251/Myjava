/* 九九乘法表 */

package tw.brad.myjava;

public class Brad99_review {

	public static void main(String[] args) {
		
//		// 現在是命令列的輸出
//		// \t tab的意思，跳脫字元
//		System.out.print("2 * 1 = 2\t");
//		System.out.print("3 * 1 = 3\t");
//		System.out.print("4 * 1 = 4\t");
//		System.out.print("5 * 1 = 5\t");
//
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		System.out.println("2 * 4 = 8");
//		System.out.println("3 * 1 = 3");
		
		// 版本一
//		for (int k=0; k<2; k++) {
//			for (int j = 1; j <= 9; j++) {
//				for (int i = 2; i < 6 ; i++) {
//					int newi = i + k * 4;
//					int r = newi * j;
//					System.out.printf("%d * %d = %d\t", newi, j, r);
//				}
//				System.out.println();
//			}
//			System.out.println("---");
//		}
		
		// 版本二
		
		// 常數一般命名為全大寫，常數有附數字，才會有彈性
		final int ROWS = 2;		// 有 ? 段
		final int COLS = 9;		// COLS 值列，共有 ? 列
		final int START = 1;	// 從 1 開始
		
		
		for (int k=0; k<ROWS; k++) {
		for (int j = 1; j <= 9; j++) {
			for (int i = START; i < START + COLS ; i++) {
				int newi = i + k * COLS;
				int r = newi * j;
				System.out.printf("%d * %d = %d\t", newi, j, r);
			}
			System.out.println();
		}
		System.out.println("---");
	}
		
		
		
	}		
}

