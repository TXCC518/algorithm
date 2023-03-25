package _3_20;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Demo1 {
	public static void main(String[] args) {
		Student s1 = new Student("张三","男",18,"202201");
		Student s2 = new Student("李四","男",19,"202202");
		Student s3 = new Student("王五","男",20,"202203");
		Student s4 = new Student("赵六","男",21,"202204");
		Student s5 = new Student("翠花","女",22,"202205");
		List<Student> list = new LinkedList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		System.out.println(list.get(0).toString());
		System.out.println("-------------------------------------");
		System.out.println(list.get(list.size()-1).toString());
		System.out.println("-------------------------------------");
		list.remove(0);
		for(int i = 0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
		System.out.println("-------------------------------------");
		for(Student s : list) {
			System.out.println(s.toString());
		}
		System.out.println("-------------------------------------");
		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println("-------------------------------------");
		for(Student s: list) {
			if("200101105".equals(s.getNo())) {
				System.out.println(s.toString());
				return;
			}
		}
		System.out.println("没有该学生");
	}
}
