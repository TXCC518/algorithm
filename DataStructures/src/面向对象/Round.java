package �������;

class Round extends Square{	//����Բ
	public Round(double length) {
		super(length);
	}
	public double permeter() {
		return Math.PI*getLength();
	}
	public double area() {
		return Math.PI*getLength()*getLength()/4;
	}
}
