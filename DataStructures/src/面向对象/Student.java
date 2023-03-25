package 面向对象;

class Student extends Person{
	private String id;
	private int score;
	public Student(String name,String sex,int age,String id, int score) {
		super(name,sex,age);
		this.id = id;
		this.score = score;
	}
	public void study() {
		System.out.println("开始学习了！");
	}
	public String print() {
		return super.print()+" 学号："+id+" 分数："+score;
	}
}
