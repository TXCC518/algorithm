package 面向对象;
/*
 * 3、使用类的继承性，实现以下功能：
给出正方形的边长，计算正方形的周长和面积；给出正方体的高，计算正方体的表面积和体积；根据给出的正方形，计算正方形内切圆的周长和面积；给出圆锥体的高，计算圆锥体的表面积和体积
 */
public class Demo3 {
	public static void main(String[] args) {
		Square square = new Square(1.0);
		Cube cube = new Cube(1.0);
		Square round = new Round(1.0);
		Cone cone = new Cone(1.0,1.0);
		
		System.out.println("正方形周长："+square.permeter());
		System.out.println("正方形面积："+square.area());
		System.out.println("正方体表面积："+cube.surfaceArea());
		System.out.println("正方体体积："+cube.volume());
		System.out.println("内切圆周长："+round.permeter());
		System.out.println("内切圆面积："+round.area());
		System.out.println("圆锥体表面积："+cone.surfaceArea());
		System.out.println("圆锥体体积："+cone.volume());
	}
}
