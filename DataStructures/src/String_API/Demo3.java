package String_API;

import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		for(int i = 0;i<s.length();i++) {
			char c = s.charAt(i);
			if(c>='A'&&c<='Z') {
				num1++;
			}
			if(c>='a'&&c<='z') {
				num2++;
			}
			if(c>=48&&c<=57) {
				num3++;
			}
		}
		System.out.println("大写字母："+num1+"个，小写字母："+num2+"个，数字:"+num3);
	}
}
