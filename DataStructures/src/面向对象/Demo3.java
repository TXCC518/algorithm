package �������;
/*
 * 3��ʹ����ļ̳��ԣ�ʵ�����¹��ܣ�
���������εı߳������������ε��ܳ������������������ĸߣ�����������ı��������������ݸ����������Σ���������������Բ���ܳ������������Բ׶��ĸߣ�����Բ׶��ı���������
 */
public class Demo3 {
	public static void main(String[] args) {
		Square square = new Square(1.0);
		Cube cube = new Cube(1.0);
		Square round = new Round(1.0);
		Cone cone = new Cone(1.0,1.0);
		
		System.out.println("�������ܳ���"+square.permeter());
		System.out.println("�����������"+square.area());
		System.out.println("������������"+cube.surfaceArea());
		System.out.println("�����������"+cube.volume());
		System.out.println("����Բ�ܳ���"+round.permeter());
		System.out.println("����Բ�����"+round.area());
		System.out.println("Բ׶��������"+cone.surfaceArea());
		System.out.println("Բ׶�������"+cone.volume());
	}
}
