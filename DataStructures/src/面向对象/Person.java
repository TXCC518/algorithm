package �������;

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
		System.out.println("�Է��ˣ�");
	}
	public void sleep() {
		System.out.println("˯���ˣ�");
	}
	public String print() {
		return "������"+name+" �Ա�"+sex+" ���䣺"+age;
	}
}
