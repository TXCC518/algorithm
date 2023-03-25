package 面向对象;

class Cone extends Round{	//圆锥体
	private double h;
	public Cone(double length,double h) {
		super(length);
		this.h = h;
	}
	public double surfaceArea() {
		double l = Math.sqrt(h*h+(getLength()*getLength()));
		return Math.PI*getLength()/2*(getLength()/2+l);
	}
	public double volume() {
		return super.area()*h/3;
	}
}
