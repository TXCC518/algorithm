package �������;
/*
 * 2����д����ʵ������Ҫ��
1����������Person,��������name���Ա�sex������age���ֶΣ����幹�췽��ʵ�ֳ�ʼ���������巽��eat( )�� sleep( )��print( )�� 
2��ͨ���̳�����Person����ѧ����student�����ѧ��id�ͳɼ�score�����幹�췽������ӷ���study����д�����е�print����
3�����������࣬�ڲ������д���ѧ����Ķ���stu�������÷���print���ѧ���������Ϣ��
 */
public class Demo2 {
	public static void main(String[] args) {
		Person stu = new Student("����","��",18,"2022101144",100);
		System.out.println(stu.print());
	}
}

