package tw.brad.myjava;

public class Brad33 {

	public static void main(String[] args) {
		
		Brad331 obj1 = new Brad331();
		
		Brad331 obj2 = new Brad332(); // 宣告為331的obj2，是由332做出來的物件實體 ex.要租一台車，實際拿到的是法拉利(照租)
		
		Brad331 obj3 = new Brad333();
		
		obj1.m1();
		obj2.m1();
		obj3.m1(); // 觀點1：宣告為何，就有哪些功能 觀點2：實作為何
		
		Brad333 obj4 = (Brad333)obj3; // 進行強制轉型
		obj4.m2();
		
//		Brad333 obj5 = (Brad333)obj1; // 進行強制轉型，原obj1是331的要轉成333的 // 編譯會過但執行錯誤!!
		
//		Brad333 obj6 = (Brad333)obj2; // 編譯會過但執行錯誤!!
		
		Brad332 obj7 = new Brad332();
//		Brad333 obj8 = (Brad333)obj7; // obj7是332的，沒辦法硬轉型為333，在編譯時就會出現錯誤
		
		Brad333 obj9 = new Brad333();
		
		
		System.out.println("---");
		
		go(obj1); // is-a，他是車子，所以可以go
		go(obj7); // is-a，同上
		go(obj9);
		
	}
	
	// static 沒辦法...
	// 定義只要是車子都能使用go
	static void go(Brad331 car) {
		car.m1();
		if (car instanceof Brad333) { // 這個car是不是333的物件實體
			((Brad333) car).m2();
		}
	}
}

class Brad331{
	// 實作
	void m1() {
		System.out.println("Brad331:m1()");
	}
}

class Brad332 extends Brad331{
	// 實作
	void m1() {
		System.out.println("Brad332:m1()");
	}
}

class Brad333 extends Brad331{
	// 實作
	void m1() {
		System.out.println("Brad333:m1()");
	}
	void m2() {
		System.out.println("Brad333:m2()"); // 把父類別改寫，並提供新功能
	}
}