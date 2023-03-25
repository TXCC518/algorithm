package 面向对象;
/*
 * 2、编写程序，实现以下要求
1）创建人类Person,包含姓名name、性别sex、年龄age等字段，定义构造方法实现初始化，并定义方法eat( )、 sleep( )和print( )。 
2）通过继承人类Person创建学生类student，添加学号id和成绩score，定义构造方法并添加方法study，重写父类中的print方法
3）创建测试类，在测试类中创建学生类的对象stu，并调用方法print输出学生的相关信息。
 */
public class Demo2 {
	public static void main(String[] args) {
		Person stu = new Student("张三","男",18,"2022101144",100);
		System.out.println(stu.print());
	}
}

