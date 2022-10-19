package tw.brad.myclass;

public class Bike extends Object {
	protected double speed;
	
	public void upSpeed() {
		speed = speed < 1 ? 1 : speed*1.2;
	}
	
	public void downSpeed() {
		speed = speed < 1 ? 0 : speed*0.7;
	}
	
	public double getSpeed() {
		return speed;
	}
	
	/* 基本型別傳的是值，物件型別傳的是址(記憶體位置) */
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return "Bike：" + speed;
	}
	
}

////設計類別時，新增class，不要勾選main方法(程式進入點)
////設計類別時，屬性最重要
////在設計時，最重要的是要先想好會有什麼"屬性"，這個最重要!!
//
//package tw.brad.myclass;
//
//public class Bike extends Object {
//
//// 設計腳踏車，但不能任意修改
////private double speed;	// 屬性：speed(速度)，為double型別
//// private 封裝，只有在此類別中才可以存取
//
//protected double speed;	// 屬性：speed(速度)，為double型別
//
//
//
//// 使用腳踏車
//public void upSpeed() {		// public void 不用傳回值	// 加速度
//	speed = speed < 1 ? 1 : speed * 1.2;
//}
//
//public void downSpeed() {	// public void 不用傳回值	// 加速度
//	speed = speed < 1 ? 0 : speed * 0.7;
//}
//
//public double getSpeed() {	// 回傳
//	return speed;
//}
//
//}