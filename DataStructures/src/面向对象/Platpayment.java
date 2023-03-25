package 面向对象;

public class Platpayment implements Payment{
	public void getBalance(double money) {
		System.out.println("通过支付平台支付了："+money+"元!");
	}
}
