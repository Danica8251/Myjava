package tw.brad.myjavatest;

public class Brad11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = (int)(Math.random()*101);
		System.out.println(score);
		
		//  90+ A, 80+ B , 70+ C, 60+ D, E
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
				System.out.println("B");
		}else if (score >=70) {
				System.out.println("C");
		}else if (score >= 60) {
				System.out.println("D");
		}else {
				System.out.println("E");
		}
				
	}

}
