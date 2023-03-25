package _3_20;

public class Student {
	private String name;
	private String sex;
	private int age;
	private String no;
	public Student(String name,String sex,int age,String no) {
		this.name = name;
		this.sex = sex;
		this.age = age;
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNo() {
		return no;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public String toString() {
		return "姓名:"+name+" 性别："+sex+" 年龄："+age+" 学号："+no;
	}
}
