package _3_16;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student("����",18);
		Student s2 = new Student("����",19);
		Student s3 = new Student("����",20);
		Student s4 = new Student("����",21);
		Student s5 = new Student("����",22);
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		for(int i = 0;i<list.size();i++) {
			System.out.println("������"+list.get(i).getName()+" ���䣺"+list.get(i).getAge());
		}
		System.out.println("------------------------------------------");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Student temp = (Student) it.next();
			System.out.println("������"+temp.getName()+" ���䣺"+temp.getAge());
		}
	}
}
