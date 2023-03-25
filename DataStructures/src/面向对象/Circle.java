package 面向对象;

class Circle{
	static final double T = 3.14;	//常量Π
	private double r;
	public Circle() {	
		
	}
	public Circle(double r) {	//构造方法
		this.r = r;
	}
	public double Perimeter() {	//求周长
		return 2*T*r;
	}
	public double Area() {	//求面积
		return  T*r*r;
	}
}
