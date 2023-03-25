package 面向对象;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment pay = null;
		System.out.println("请选择支付方式：1、支付平台支付 2、银行卡网银支付 3、信用卡快捷支付");
		System.out.print("请输入您的支付方式：");
		int num = sc.nextInt();
		switch(num) {
		case 1:
			pay = new Platpayment();
			break;
		case 2:
			pay = new Bankpayment();
			break;
		case 3:
			pay = new Creditpayment();
		}
		System.out.print("请输入您的支付金额：");
		double money = sc.nextDouble();
		pay.getBalance(money);
	}
}
