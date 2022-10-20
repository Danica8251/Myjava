/* 抽象方法=>當場實作，這也是一種多型 */

package tw.brad.myjava;

public class Brad35 {

	public static void main(String[] args) {
		
		Brad351 obj1 = new Brad351() {
			
			@Override
			void m2() { // 當場實作
				// TODO Auto-generated method stub
				
			}
		};
		
		m1(new Brad351() {
			
			@Override
			void m2() {
				// TODO Auto-generated method stub
				
			}
		});
		}
	static void m1(Brad351 obj) {
		
	}
}

abstract class Brad351{
	void m1() {}
	abstract void m2();
}
