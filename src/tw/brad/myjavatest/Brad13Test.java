package tw.brad.myjavatest;

public class Brad13Test {
	
	/*
	閏年規則
	公元年分非4的倍數，為平年。
	公元年分為4的倍數但非100的倍數，為閏年。
	公元年分為100的倍數但非400的倍數，為平年。
	公元年分為400的倍數為閏年。
	 */
	
	public  static void main (String[] args) {
		
		int year = 2022;
		
		// year / 400 的餘數=0 或 (year / 4 的餘數=0 並且 year / 100的餘數≠0)
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
			System.out.println("閏年");
		}else {
			System.out.println("平年");
		}
		
	}

}
