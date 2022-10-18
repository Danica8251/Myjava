package tw.brad.myjava;

public class Brad21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 作弊版，出現次數會不一樣
		int[] p = new int[7];	// 0 ~ 6
		for (int i = 0;i < 100; i++) {
			int point = (int)(Math.random() * 9) + 1;	// 1 ~ 9
			p[point<=6 ? point : point-3]++;	// 三元運算式
		}
		for (int i=1; i<=6;i++) {
			System.out.printf("%d點出現%d次\n",i,p[i]);
		}

	}

}
