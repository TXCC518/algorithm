package 面向对象;

class Round extends Square{	//内切圆
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
