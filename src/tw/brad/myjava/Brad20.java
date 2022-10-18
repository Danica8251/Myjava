package tw.brad.myjava;

public class Brad20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 正常版
		int[] p = new int[7];	// 0 ~ 6
		for (int i = 0;i < 100; i++) {
			int point = (int)(Math.random() * 6) + 1;	// 1 ~ 6
			p[point]++;
		}
		for (int i=1; i<=6;i++) {
			System.out.printf("%d點出現%d次\n",i,p[i]);
		}

	}

}
