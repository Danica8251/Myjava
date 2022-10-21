/* 自動封箱 */

package tw.brad.myjava;

public class Brad41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ★宣告型別為何，就是什麼
		int a = 10, b = 3; // 基本型別的東西
		Integer c = a + b; // 物件型別的東西(c是Integer的物件實體)
		System.out.println(c.intValue()); // c是物件型別，所以可以呼叫物件方法intValue
		
		int d = c - b;
		System.out.println(d);

	}

}
