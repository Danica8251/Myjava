package tw.brad.myjava;

import java.util.Scanner;

public class Brad16 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// 不要用背的!!要理解然後打得出來
		System.out.println("Month = ");
			int month = scanner.nextInt();
			int days;
			switch(month) {
				case 1,3,5,7,8,10,12:
					days = 31;
				break;
				case 2:
					days = 28;
					break;
				case 4: case 6: case 9: case 11:	// 基本寫法，使用 , 是之後才出現的
					days = 30;
				break;
				default:
					days = 0;
			}
			System.out.printf("%d月有%d天", month, days);	
	}
}
