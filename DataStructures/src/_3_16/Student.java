package _3_16;
/*
 * 1��	����ѧ��Student�ࣺ
1��	����2�����ԣ��ֱ������������䡣
2��	���幹�췽��
3��	���getXX����
 */
public class Student {
	private String name;
	private int age;
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
