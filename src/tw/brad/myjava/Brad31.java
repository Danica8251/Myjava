package tw.brad.myjava;

import tw.brad.myclass.TWId; // 對應TWId.java檔

public class Brad31 {

	public static void main(String[] args) {
		
//		String id = "A123456789";
//		if (TWId.isValidTWId(id)) {
//			System.out.println("OK");
//		}else {
//			System.out.println("XX");
//		}
		
		
		/* 身份證字號產生器 */
		TWId id1 = new TWId(); // 隨機
		System.out.printf("ID1： %s \n", id1.getId());
		
		TWId id2 = new TWId(false); // 限制 false => 女生
		System.out.printf("ID2： %s \n", id2.getId());
		
		TWId id3 = new TWId(4); // 限制 地區為第 5 個(因開頭從0開始)
		System.out.printf("ID3： %s \n", id3.getId());
		
		TWId id4 = new TWId(7); // 限制 地區為第 8 個(因開頭從0開始)
		System.out.printf("ID4： %s \n", id4.getId());
		
			
		
	}

}
