package tw.brad.myjava;

import org.xml.sax.ext.Attributes2;

public class Brad37 {

	public static void main(String[] args) {
		RectShape s1 = new RectShape(); s1.w1 = 10; s1.w2 = 20;
		CircleShape s2 = new CircleShape(); s2.r = 3;
		viewShape(s1);
		viewShape(s2);
	}
	
	static void viewShape(Shape s) {
		System.out.printf("Length：%f；Area： %f", s.length(), s.area()); // 浮點數用 %f
	}

}

interface Shape{ // 幾何形狀都可以算出邊長、面積 // 回傳double
	double length(); // 回傳邊長
	double area(); // 回傳面積
}

class RectShape implements Shape{
	double w1, w2;
	public double length() {return(w1 + w2) * 2;}
	public double area() {return w1 * w2;}
}

class CircleShape implements Shape{
	double r;
	public double length() {return 2 * Math.PI * r;}
	public double area() {return r * r * Math.PI;}
}