package String_API;

public class Demo2 {
	public static void main(String[] args) {
		String s1 = "Hello Java";
		String s2 = "Hello Applet";
		String s3 = "Java";
		String max = s1;
		if(max.compareTo(s2)<0) {
			max = s2;
		}
		if(max.compareTo(s3)<0) {
			max = s3;
		}
		System.out.println(max);
	}
}
