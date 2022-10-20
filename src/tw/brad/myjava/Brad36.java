/* 
 * interface介面就是實作，如果要介面就是一定要實作出來，實現多型
 * 介面可以多重繼承
 */

package tw.brad.myjava;

public class Brad36 {

	public static void main(String[] args) {
		
		Brad361 obj1 = new Brad362(); // 362有實作361的介面
		Brad363 obj2 = new Brad362(); // 362有實作361的介面
		
		Brad361 obj3 = new Brad361() { // 361是介面，直接實作，業界常用此code
			
			@Override
			public void m2() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void m1() {
				// TODO Auto-generated method stub
				
			}
		};
		
	}

}

interface Brad361{ // interface介面，介面叫做規格，規格定義出來就是實作，全部都public，沒有存取修飾字，與Object無關
	void m1(); // 抽象
	void m2();
}

class Brad362 implements Brad361,Brad363 { // 對外說做得到，但還沒做到 // 實作兩個介面
	public void m1() {}
	public void m2() {}
	public void m3() {} // 介面可以多重實作 ex.一個人可以考多張證照
	public void m4() {}
}

interface Brad363{ // 另外一個介面叫363
	void m3();
	void m4();
}

interface Brad364 extends Brad361, Brad363{ // 364是介面，來繼承361、363=>介面可以多重繼承
	void m5();
}

