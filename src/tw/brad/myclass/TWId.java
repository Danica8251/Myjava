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

// 搭配 Brad31
	
	public static boolean isValidTWId(String id){ // 專門用來傳回布林值，是否為有效TWId // 呼叫這個方法傳遞字串
		boolean ret = false;
		
		if (id.matches("[A-Za-z][1289][0-9]{8}")) {
					// [A-Za-z]：第一碼;[1289]：第2碼;[0-9]{8}：第3碼要出現8次
			ret = true;
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
