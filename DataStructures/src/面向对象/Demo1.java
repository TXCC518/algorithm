package �������;

import java.util.Scanner;

/*
 * 1����д����ʵ������Ҫ��
��1������Բ��Circle, ����뾶r�����幹�췽�����г�ʼ���������巽��Area��Perimeter�ֱ����Բ���ܳ��������
��2�����������࣬�ڲ������д���Բ��Ķ���cir���ֱ���÷���Բ���ܳ���������м��㲢�����
 */
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("������뾶r:");
		double r = sc.nextDouble();
		Circle cir = new Circle(r);
		System.out.println("�ܳ���"+cir.Perimeter());
		System.out.println("�����"+cir.Area());
	}
}
