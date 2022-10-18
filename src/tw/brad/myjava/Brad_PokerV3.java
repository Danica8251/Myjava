package tw.brad.myjava;

public class Brad_PokerV3 {
	
	/* 1 ~ 100 的質數有哪些 */

	public static void main(String[] args) {
		
		int i,j ;
		
		for (i=1; i<=100;i++) {
			for(j=2; j<i;j++) {
				if(i % j == 0)
					break;
			}
			if (j >= i)
				System.out.println(j);
		}
		
	}

}

/* 此作法每個數字都會先從2開始跑，跑到該數字 一個一個核實沒有整除 */