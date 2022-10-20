package tw.brad.myjavatest;

import java.util.Scanner;

public class Brad16Test {

	public static void main(String[] args) {
		
		// Scanner是一個類別，而類別需要被初始化(實體化)成物件才能使用
		// Scanner傳回字元
		Scanner scanner = new Scanner(System.in); // Scanner是一種類別，要new一個物件出來
		
		//提示輸入月份
		System.out.println("Month = ");
					
		// 宣告名稱分別為month和days的變數，型別為int，month的值為scanner.nextInt()輸入的字元
			int month = scanner.nextInt();
			int days;
			
		// switch-case用於比對整數、字元、Enum、字串，Enum
			switch(month) {
				// 如果month=1,3,5,7,8,10,12，則days=31，並跳出
				case 1,3,5,7,8,10,12:
					days = 31;
				break;
				
				// 如果month=2，則days=28，並跳出
				case 2:
					days = 28;
				break;
				
				// 如果month=4,6,9,11，則days=30，並跳出
				case 4,6,9,11:
					days = 30;
				break;
				
				// 若month的值都不是上述的數字，則days=0，因是最後，故不用寫break，可直接跳出
				default:
					days = 0;
			}
		System.out.printf("%d月有%d天", month, days);
	}
}

/*
 提示：
 switch(變數或運算式) {
    case 整數、字元、字串或Enum:
        陳述句;
        break;
    case 整數、字元、字串或Enum:
        陳述句;
        break;
    ...
    default:
        陳述句;
　}
 */
