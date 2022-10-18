package tw.brad.myjava;

import java.lang.invoke.StringConcatException;

public class Brad30 {

	public static void main(String[] args) {
		
		// 任何一個字串一旦決定內容，就不能變動，變了之後記憶體已經是另外一個物件
		
		String s1 = "Brad"; // 記憶體配置並把位置給 Brad
		
		String s2 = new String();
		byte[] b1 = {97, 98, 99 ,100, 101, 102}; // 常用 // 輸出abcdef (ASCII code)
		
		String s3 = new String(b1);
		System.out.println(s3);

		String s4 = new String(b1, 2, 4);
		System.out.println(s4);
		
		s4.concat("ghijk");
		System.out.println(s4); // 輸出 cdef，s4內容不做變動
		
		String s5 = s4.concat("ghijk");
		System.out.println(s5); // 輸出 cdefghijk，s5是新物件
		
		System.out.println("Brad".charAt(1));
		
	}

}
