package tw.brad.myjavatest;

public class Brad10Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// score => 0 ~ 100(int)，共有101個數字
		
		int score = (int)(Math.random() * 101);
		System.out.println(score);
		
		if (score <= 60) {
			System.out.println("及格");
		}else {
			System.out.println("不及格");
		}
		

	}

}
