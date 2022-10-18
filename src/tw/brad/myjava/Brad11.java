package tw.brad.myjava;

public class Brad11 {

	public static void main(String[] args) {
		int score = (int)(Math.random() * 101);	// 101 代表用來產生 101 個整數值，0 ~ 100 總共有 101 個數字
		System.out.println(score);
		
		// if 在做的事情就是二分法
		// 90+ A, 80+ B , 70+ C, 60+ D, E
		
		// 第 1 種寫法
		if (score >= 90) {
			System.out.println("A");
		}else {
			if (score >= 80) {
				System.out.println("B");
			}else {}
				if (score >=70) {
					System.out.println("C");
				}else {
						if(score >= 60) {
								System.out.println("D");
						}else {
								System.out.println("E");
						}
				}
		}
		
		System.out.println("==================");
		/* 第 2 種寫法 */
		if (score >= 90) {
			System.out.println("A");
		}else if (score >= 80) {
				System.out.println("B");
		}else if (score >=70) {
				System.out.println("C");
		}else if(score >= 60) {		
				System.out.println("D");
		}else {
				System.out.println("E");
		}

	}
}
