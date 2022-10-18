package tw.brad.myjava;

import java.util.Scanner;

public class Brad24 {

	public static void main(String[] args) {
		// 1 + 2 + 3 + ... + n = ?
		int i = 1;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("n = ");
		int n = scanner.nextInt();
		
		// 寫法一 while迴圈
//		while (i <= n) {
////			sum = sum +i;	// 1, 2
////			i++;
//			
//			sum += i++;	// 1, 2 簡化 code
//		}
		
		// 寫法二 for迴圈
		for (;i <= n;) {
			sum += i++;
		}
		
		System.out.printf("1 + 2 + ... + %d = %d", n, sum);

	}

}
