package �������;

class Square{		//������
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
