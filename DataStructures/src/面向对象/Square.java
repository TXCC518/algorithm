package 面向对象;

class Square{		//正方形
	private double length;
	public Square(double length) {
		this.length = length;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double permeter() {
		return 4*length;
	}
	public double area() {
		return length*length;
	}
}
