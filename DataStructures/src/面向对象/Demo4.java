package �������;
/*
 * 4����д����,ʵ������Ҫ��
1������������shape,Ҫ������
      �� ���󷽷�area��perimeter    abstract
�� print        

2��ͨ���̳�shape������������rectangle��Ҫ������
�� �ֶΣ���l�Ϳ�w
�� ����
���췽����ʵ�ֳ�ʼ����
��д�����е�area����������ε������
��д�����е�perimeter����������ε��ܳ�
   ��д�����е�print����,������ε��ܳ������

3��ͨ���̳�shape������Բ��Circle��Ҫ������
�� �ֶΣ��뾶r
�� ����
���췽����ʵ�ֳ�ʼ����
��д�����е�area��������Բ�����  
      ��д�����е�perimeter��������Բ�ܳ�
��д�����е�print���������Բ���ܳ������

4�����������Test
�ֱ𴴽��������Բ��Ķ���rec��cir��������print( )��������ܳ�������ļ�����
 */
public class Demo4 {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(1.0,2.0);
		Circles circle = new Circles(1.0);
		System.out.println(rectangle.print());
		System.out.println(circle.print());
	}
}