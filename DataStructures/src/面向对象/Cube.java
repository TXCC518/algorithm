package �������;

class Cube extends Square{	//������

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
