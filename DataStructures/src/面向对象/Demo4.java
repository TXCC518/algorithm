package 面向对象;
/*
 * 4、编写程序,实现以下要求：
1）创建抽象类shape,要求如下
      ① 抽象方法area和perimeter    abstract
② print        

2）通过继承shape，创建矩形类rectangle，要求如下
① 字段：长l和宽w
② 方法
构造方法：实现初始化。
重写基类中的area方法，求矩形的面积。
重写基类中的perimeter方法，求矩形的周长
   重写基类中的print方法,输出矩形的周长和面积

3）通过继承shape，创建圆类Circle，要求如下
① 字段：半径r
② 方法
构造方法：实现初始化。
重写基类中的area方法，求圆面积。  
      重写基类中的perimeter方法，求圆周长
重写基类中的print方法，输出圆的周长和面积

4）定义测试类Test
分别创建矩形类和圆类的对象rec和cir，并调用print( )方法输出周长和面积的计算结果
 */
public class Demo4 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(1.0,2.0);
		Circles circle = new Circles(1.0);
		System.out.println(rectangle.print());
		System.out.println(circle.print());
	}
}