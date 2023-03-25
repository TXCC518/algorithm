package 面向对象;

import java.util.Scanner;

public class Demo5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank(100.0);
		while(bank.getBalabce()>=0) {
		System.out.println("请选择支付方式：1、支付平台支付 2、银行卡网银支付 3、信用卡快捷支付");
		System.out.print("请输入您的支付方式：");
		int no = sc.nextInt();
		System.out.print("请输入你的支付金额：");
		double money = sc.nextDouble();
		if(bank.getBalabce()<money) {
			System.out.println(bank.getAdd(money));
			break;
		}
		if(no==1) {
			System.out.print("通过支付平台支付了：");
		}else if(no==2) {
			System.out.print("通过银行卡网银支付了：");
		}else if(no==3) {
			System.out.print("通过信用卡快捷支付了：");
		}
		System.out.println(bank.getAdd(money));
		}
	}
}
interface Pay {
	String getAdd(double money);
}

class Bank implements Pay{
	private double balabce;

	public Bank(double balabce) {
		super();
		this.balabce = balabce;
	}

	public double getBalabce() {
		return balabce;
	}

	public void setBalabce(double balabce) {
		this.balabce = balabce;
	}
	public String getAdd(double money) {
		balabce = balabce-money;
		if(balabce<0) {
			return "余额不足！！！";
		}else {
			return money+"元";
		}
	}
}
