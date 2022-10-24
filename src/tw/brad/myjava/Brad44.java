package tw.brad.myjava;

public class Brad44 {
	
	/*
	 * 例外處理 
	 */
	
	public static void main(String[] args) {
		Bird b1 = new Bird();
		try {
			b1.setLeg(3); // 保持原值不變，並例外處理
		} catch (Exception e) {
			System.out.println("XXX");
		}
		System.out.println(b1.leg);
	}
}

class Bird{
	int leg;
	void setLeg(int n) throws Exception { // 如有例外發生，要先告知
		if (n >= 0 && n <= 2) {
			leg = n;	
		}else {
			throw new Exception();
		}
	}
}
