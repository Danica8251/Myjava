package tw.brad.myclass;

//宣告定義 Scooter 的類別
public class Scooter extends Bike{	// extends 延伸、延展、擴大
	// 讓摩托車發揚光大腳踏車
	// 腳踏車為父類別
	
	//所有類別一定會有父類別，若沒寫則會是 Object
	private int gear;	// 0
	private int color;
	
	public Scooter() {
		this(2);
	}
	
	// 建構式觀念：只要寫得出來的Java 類別，就一定要有建構式!!
	// 一但有指定，就不要管父類別了
	// ★建構式：進行物件實體的初始化，其名稱與類別名稱一模一樣，與產生物件沒有關係，也不會有傳回值
	public Scooter(int color) {
		this.color = color; // 摩托車有這個屬性了
		
	}
	


	public void upSpeed() {
		speed = speed < 1 ? 1 : speed + speed*gear;
	}

	public void upSpeed(boolean isTurbo) {
		if (isTurbo) {
			speed = speed < 1 ? 1 : speed + speed*gear*1.2;
		}else {
			upSpeed();
		}
	}

	// 設計方法的名稱 upSeed 全小寫屬性首字大寫
	// 設計讓人使用都是 public
	public int changeGear(int gear) {
		if (gear >=0 && gear <=5) {
			this.gear = gear;
		}
		return this.gear;
	}
	public int getGear() {
		return gear;
	}

}

