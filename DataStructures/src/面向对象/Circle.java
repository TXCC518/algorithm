package �������;

class Circle{
	static final double T = 3.14;	//������
	private double r;
	public Circle() {	
		
	}
	public Circle(double r) {	//���췽��
		this.r = r;
	}
	public double Perimeter() {	//���ܳ�
		return 2*T*r;
	}
	public double Area() {	//�����
		return  T*r*r;
	}
}
