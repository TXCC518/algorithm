package 面向对象;

public class Creditpayment implements Payment{
	public void getBalance(double money) {
		System.out.println("通过信用卡快捷支付了："+money+"元!");
	}
}
