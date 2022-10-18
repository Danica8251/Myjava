/*
练习题：最优选择2
小蓝同学想买一个价值8888元的新手机，她的旧手机在二手市场能卖1880元，
而手机专卖店推出以旧换新的优惠，把她的旧手机交给店家，新手机就能够打7.5折优惠。
为了更省钱，小蓝要不要以旧换新？
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
