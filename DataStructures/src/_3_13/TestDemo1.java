package _3_13;
import java.util.*;
import java.text.*;

public class TestDemo1 {
	public static void main(String[] args) {
		SimpleDateFormat si = new SimpleDateFormat("yyyyMMdd");
		Scanner sc = new Scanner(System.in);
		System.out.print("��������ƷID�ţ�");
		String s = sc.next();
		System.out.println("������ţ�"+si.format(new Date())+s+(int)((Math.random()*9+1)*100000));
	}
}
