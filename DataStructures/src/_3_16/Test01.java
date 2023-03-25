package _3_16;

import java.util.*;

public class Test01 {
	public static void main(String[] args) {
		Student s1 = new Student("张三",18);
		Student s2 = new Student("李四",19);
		Student s3 = new Student("王五",20);
		Student s4 = new Student("赵六",21);
		Student s5 = new Student("麻子",22);
		List<Student> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		for(int i = 0;i<list.size();i++) {
			System.out.println("姓名："+list.get(i).getName()+" 年龄："+list.get(i).getAge());
		}
		System.out.println("------------------------------------------");
		Iterator it = list.iterator();
		while(it.hasNext()) {
			Student temp = (Student) it.next();
			System.out.println("姓名："+temp.getName()+" 年龄："+temp.getAge());
		}
	}
}
