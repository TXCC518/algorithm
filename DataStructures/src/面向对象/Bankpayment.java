package 面向对象;

public class Bankpayment implements Payment{
	public void getBalnce(double money) {
		System.out.println("通过银行卡网银支付了："+money+"元！");
	}
}
