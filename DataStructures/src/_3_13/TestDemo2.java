package _3_13;
import java.util.*;
public class TestDemo2 {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		int weekday = cal.get(Calendar.DAY_OF_WEEK);
		boolean b = false;
		if(weekday==5) b = true;
		if(b) {
			System.out.println("是超省星期五");
		}else {
			System.out.println("不是超省星期五");
		}
	}
}
