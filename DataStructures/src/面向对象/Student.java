package �������;

class Student extends Person{
	private String id;
	private int score;
	public Student(String name,String sex,int age,String id, int score) {
		super(name,sex,age);
		this.id = id;
		this.score = score;
	}
	public void study() {
		System.out.println("��ʼѧϰ�ˣ�");
	}
	public String print() {
		return super.print()+" ѧ�ţ�"+id+" ������"+score;
	}
}
