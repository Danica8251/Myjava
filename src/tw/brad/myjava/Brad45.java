package tw.brad.myjava;

import java.nio.channels.AlreadyBoundException;

import javax.management.BadAttributeValueExpException;

public class Brad45 {

	public static void main(String[] args) {
		Brad451 obj = new Brad451();
		try {
			obj.m2();
		} catch (Exception e) {
			System.out.println("XXX");
		}
	}
}

class Brad451{
	void m1() throws Exception{ // 會拋出例外，故要先宣告
		System.out.println("Brad451:m1()");
	} 
	void m2() throws Exception {
		m3();
	}
	void m3() throws Exception {
		m4(2);
	}
	void m4(int a) throws Exception{
		if (a < 10) {
			System.out.println("OK");
		}else {
			throw new Exception();
		}
	}
}

class Brad452 extends Brad451{
	void m1() throws AlreadyBoundException, BadAttributeValueExpException {
		System.out.println("Brad452:m1()");
	}
}

class Brad453 extends Brad452{
	void m1() throws RuntimeException { // Runtime只會在執行時有例外
		System.out.println("Brad453:m1()");
	}
}