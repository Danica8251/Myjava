package tw.brad.myjava;

import tw.brad.myclass.Bike;	// 跟此class檔有關聯，因為有在此檔定義bike
import tw.brad.myclass.Scooter;

public class Brad25 {

	public static void main(String[] args) {
		Bike b1 = new Bike();
		System.out.println(b1.getSpeed());
		while (b1.getSpeed()<=10) {
			b1.upSpeed();
		}
		System.out.println(b1.getSpeed());
		System.out.println("---");
		
		Scooter s1 = new Scooter();
		System.out.println(s1.getSpeed() + ":" + s1.getGear());
		s1.changeGear(2);
		s1.upSpeed(); s1.upSpeed();
		System.out.println(s1.getSpeed());
		
		s1.changeGear(s1.getGear() + 1);
		s1.upSpeed(); s1.upSpeed();
		System.out.println(s1.getSpeed());
		
		
		
	}

}
		
//		Bike b1 = new Bike();
//		Bike b2 = new Bike();
//		
//		System.out.println(b1.speed);	// 已經在Bike.java裡完成初始化了，故不會出現錯誤訊息
//		System.out.println(b2.speed);
//		
//		// b1 跟 b2 差在屬性的值
//		b1.speed = 123;
//		b2.speed = 10.2;
//		System.out.println(b1.speed);
//		System.out.println(b2.speed);
//		
//		System.out.println("---");
//		
//		b1.upSpeed();b1.upSpeed();b1.upSpeed();b1.upSpeed();
//		System.out.println(b1.speed);
//		
//		b2.downSpeed();b2.downSpeed();b2.downSpeed();b2.downSpeed();
//		System.out.println(b2.speed);