package �������;

class Circles extends Shape{
	private double r;

	public Circles(double r) {
		super();
		this.r = r;
	}
	public double area() {
		return Math.PI*r*r;
	}
	public double perimeter() {
		return 2*Math.PI*r;
	}
	public String print() {
		return "�ܳ���"+perimeter()+" �����"+area();
	}
}
