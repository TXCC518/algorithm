package �������;

import java.util.Scanner;

public class Demo5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank(100.0);
		while(bank.getBalabce()>=0) {
		System.out.println("��ѡ��֧����ʽ��1��֧��ƽ̨֧�� 2�����п�����֧�� 3�����ÿ����֧��");
		System.out.print("����������֧����ʽ��");
		int no = sc.nextInt();
		System.out.print("���������֧����");
		double money = sc.nextDouble();
		if(bank.getBalabce()<money) {
			System.out.println(bank.getAdd(money));
			break;
		}
		if(no==1) {
			System.out.print("ͨ��֧��ƽ̨֧���ˣ�");
		}else if(no==2) {
			System.out.print("ͨ�����п�����֧���ˣ�");
		}else if(no==3) {
			System.out.print("ͨ�����ÿ����֧���ˣ�");
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
			return "���㣡����";
		}else {
			return money+"Ԫ";
		}
	}
}
