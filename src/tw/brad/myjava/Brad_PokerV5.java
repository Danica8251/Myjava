package tw.brad.myjava;

public class Brad_PokerV5 {

	public static void main(String[] args) {
		int nums =10;
		int[] poker = new int[nums];
		
		// 文具行買回來的撲克牌
		for (int i = 0; i < nums; i++) poker[i] = i;
		
		// 開始洗牌
		for (int i = nums - 1; i > 0; i--) {
//			System.out.println(i); // 驗算
			int rand = (int)(Math.random() * (i + 1)); // 0 ~ 9 共10個數字
		
			// poker[rand] <-> poker[i]
			int temp = poker[rand];
			poker[rand] = poker[i];
			poker[i] = temp;
			
		}
		
		for (int card : poker) {
			System.out.println(card);
		}
		
	}

}
