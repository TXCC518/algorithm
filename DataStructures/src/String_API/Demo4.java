package String_API;

public class Demo4 {
	public static void main(String[] args) {
		String s = "kk";
		String ss = "abkkcdkkefkkskk";
		int count = 0;
		for(int i = 0;i<ss.length();i++) {
			int index = ss.indexOf(s,i);
			if(index!=-1) {
			count++;
			i = index + s.length();
			}
		}
		System.out.println(count);
	}
}
