package tw.brad.myclass;

public class TWId {
	
/*
 * 身分證重點：
 * 1.長度為10(共10碼) 
 * 2.首字英文，其他數字 
 * 3.第2個數字1、2、8、9，區別男女、外來男女
 * 4.第三碼到第10碼都是數字
 * 5.驗證 可被10整除
 */

	private String id;
	private static String letters = "ABCDEFGHJKLMNPQRSTUVXYZIO"; // static可以去呼叫 static的東西 // 步驟四

	
	// 建構式 身分證初始化
	// 直接傳遞參數給他
	// 一旦 new，物件已經做出來無法改變
	
	/* 身份證字號產生器，做出物件實體 */
	// 無傳參數，隨機產生身分證字號
	public TWId() { // 沒有型別，也沒有個數 // 步驟一
		this((int)(Math.random()*2) == 0);
	}
	
	/* 指定男或女 */
	public TWId(boolean isMale) { // 型別：boolean，個數 1 個 // 步驟二
		this(isMale,(int)(Math.random()*26));
	}
	
	/* 指定地區 */
	public TWId(int area) { // 型別：int，個數 1 個 // 步驟三
		this((int)(Math.random()*2) == 0, area);
		
	}
	
	/* 指定性別跟地區 */
	public TWId(boolean isMale, int area) { // 型別：boolean、int，個數 2 個 // 步驟五
		StringBuffer sb = new StringBuffer();
		sb.append(letters.substring(area, area+1))
			.append(isMale?"1":"2")				// 第二碼
			.append((int)(Math.random()*10))		// 第三碼
			.append((int)(Math.random()*10))		// 第四碼
			.append((int)(Math.random()*10))		// 第五碼
			.append((int)(Math.random()*10))		// 第六碼
			.append((int)(Math.random()*10))		// 第七碼
			.append((int)(Math.random()*10))		// 第八碼
			.append((int)(Math.random()*10));	// 第九碼
		String temp = sb.toString();
		for (int i=0; i<10; i++) {
			if (isValidTWId(temp + i)) {
				id = temp + i;
			}
		}

	}
	
	public String getId() { // String 是固定不變的
		return id;
	}
	
	// 練習題
	public boolean isMale() {
		
		
		
		return true;
	}
	
	private TWId(String id) {
		this.id = id;
	}
	
	public static TWId createTWId(String id) {
		TWId temp = null;
		if (isValidTWId(id)) {
			temp = new TWId(id);
		}
		return temp;
	}
	

	
	// 搭配 Brad31
	
	public static boolean isValidTWId(String id){ // 專門用來傳回布林值，是否為有效TWId // 呼叫這個方法傳遞字串
		boolean ret = false;
		
		if (id.matches("[A-Za-z][1289][0-9]{8}")) {
					// [A-Za-z]：第一碼;[1289]：第2碼;[0-9]{8}：第3碼要出現8次
			
			letters = "ABCDEFGHJKLMNPQRSTUVXYZIO";
//			String letters = "ABCDEFGHJKLMNPQRSTUVXYZIO"; // 移到第15列
			char c1 = id.charAt(0);
			int pos = letters.indexOf(c1); // 0 ~ 25
			int n12 = pos + 10; // 10 ~ 35
			int n1 = n12 / 10;
			int n2 = n12 % 10;
			
			/* n3 ~ n11 */
			String s3 = id.substring(1, 2);
			int n3 = Integer.parseInt(s3);
			
			int n4 = Integer.parseInt(id.substring(2, 3));
			int n5 = Integer.parseInt(id.substring(3, 4));
			int n6 = Integer.parseInt(id.substring(4, 5));
			int n7 = Integer.parseInt(id.substring(5, 6));
			int n8 = Integer.parseInt(id.substring(6, 7));
			int n9 = Integer.parseInt(id.substring(7, 8));
			int n10 = Integer.parseInt(id.substring(8, 9));
			int n11 = Integer.parseInt(id.substring(9, 10));
			
			/* 有效碼計算公式 */
			int sum = n1*1 + n2*9 + n3*8 + n4*7 + n5*6 + n6*5 + n7*4 + n8*3 + n9*2 + n10*1 + n11*1;
			
			/* 有效碼驗證 */
			ret = sum % 10 == 0;
			
			
			
		}
		
//		if (id.length() == 10) { // 第一關
//			char c1 = id.charAt(0);
//			
//			// 寫法一
//			if (Character.isLetter(c1)) { // 第二關
//				String c2nds = "1289"; // 第三關
//				String c2nd = id.substring(1, 2);
//				if (c2nds.contains(c2nd)) {
//					String c310nds = "123456789" ;
//					String c310nd = id.substring(c1);
//					
//					return true;
//				}
//			}
//			
//			// 寫法二
////			String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
////			if (letters.indexOf(c1) >= 0) {
////			}
//			
//			
//		}

		return ret;
		
	}
}
