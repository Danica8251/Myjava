/*
練習題：最優選擇2
小藍同學想買一個價值8888元的新手機，她的舊手機在二手市場能賣1880元，
而手機專賣店推出以舊換新的優惠，把她的舊手機交給店家，新手機就能夠打7.5折優惠。
為了更省錢，小藍要不要以舊換新？
  */

package tw.online.test;

public class test12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int oldiphone = 1880;
		int newiphone = 8888;
		
		int saleiphone = newiphone - oldiphone;
		double changeiphone = (int)newiphone * 0.75;
		
		if (saleiphone > changeiphone) {
			System.out.println("不使用以舊換新更省錢");
		}else {
			System.out.println("使用以舊換新更省錢");
		}
		

	}

}
