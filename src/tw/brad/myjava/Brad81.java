package tw.brad.myjava;

public class Brad81 {

	public static void main(String[] args) {
		Brad811 obj = new Brad811();
		obj.m1(-1);

	}

}

//普通類別
class Brad811 {
	void m1(int a) {
		try {

			if (a < 0) {
				throw new Exception();
			}
			System.out.println("OK");
			// return;

		} catch (Exception e) { // catch 不會獨立存在
			System.out.println("XX");
			return;

		} finally {
			System.out.println("finally");
		}
		System.out.println("end");
	}
}