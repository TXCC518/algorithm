package _3_13;
import java.util.*;
import java.text.*;
public class TestSimple {
	public static void main(String[] args) {
		SimpleDateFormat simple = new SimpleDateFormat("yyyy��MM��dd��HH��mm��ss��SSS����");
		Date date = new Date();
		System.out.println(simple.format(date));
	}
}
