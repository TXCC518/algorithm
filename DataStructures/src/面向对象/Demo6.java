package �������;

import java.util.Scanner;

public class Demo6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Payment pay = null;
		System.out.println("��ѡ��֧����ʽ��1��֧��ƽ̨֧�� 2�����п�����֧�� 3�����ÿ����֧��");
		System.out.print("����������֧����ʽ��");
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
		System.out.print("����������֧����");
		double money = sc.nextDouble();
		pay.getBalance(money);
	}
}
