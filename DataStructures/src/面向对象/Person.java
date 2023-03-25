package 面向对象;

class Person{
	private String name;
	private String sex;
	private int age;
	public Person(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	public void eat() {
		System.out.println("吃饭了！");
	}
	public void sleep() {
		System.out.println("睡觉了！");
	}
	public String print() {
		return "姓名："+name+" 性别："+sex+" 年龄："+age;
	}
}
