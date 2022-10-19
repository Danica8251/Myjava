package tw.brad.myjava;

import tw.brad.myclass.TWId; // 對應TWId.java檔

public class Brad31 {

	public static void main(String[] args) {
		
		String idString = "A123456789";
		if (TWId.isValidTWId(idString)) {
			System.out.println("OK");
		}else {
			System.out.println("XX");
		}
			
		
	}

}
