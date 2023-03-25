package 面向对象;

import java.util.Scanner;

/*
 * 1、编写程序，实现以下要求
（1）创建圆类Circle, 定义半径r，定义构造方法进行初始化，并定义方法Area和Perimeter分别计算圆的周长和面积。
（2）创建测试类，在测试类中创建圆类的对象cir，分别调用方法圆的周长和面积进行计算并输出。
 */
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入半径r:");
		double r = sc.nextDouble();
		Circle cir = new Circle(r);
		System.out.println("周长："+cir.Perimeter());
		System.out.println("面积："+cir.Area());
	}
}
