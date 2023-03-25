package _3_16;
/*
 * 1、	创建学生Student类：
1）	具有2个属性，分别是姓名和年龄。
2）	定义构造方法
3）	添加getXX方法
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
