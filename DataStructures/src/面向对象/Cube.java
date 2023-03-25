package 面向对象;

class Cube extends Square{	//正方体

	public Cube(double length) {
		super(length);
	}
	public double surfaceArea() {
		return 6*getLength()*getLength();
	}
	public double volume() {
		return getLength()*getLength()*getLength();
	}
}
