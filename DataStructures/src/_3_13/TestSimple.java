package _3_13;
import java.util.*;
import java.text.*;
public class TestSimple {
	public static void main(String[] args) {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy年MM月dd日HH点mm分ss秒SSS毫秒");
		Date date = new Date();
		System.out.println(simple.format(date));
	}
}
