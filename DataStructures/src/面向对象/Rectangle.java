package �������;

class Rectangle extends Shape{
	private double l;
	private double w;
	public Rectangle(double l, double w) {
		super();
		this.l = l;
		this.w = w;
	}
	public double area() {
		return l*w;
	}
	public double perimeter() {
		return 2*(l+w);
	}
	public String print() {
		return "�ܳ���"+perimeter()+" �����"+area();
	}
}
