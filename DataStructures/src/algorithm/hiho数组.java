package algorithm;
/*
 * 找出一个字符串中恰好包含2个h、1个i、1个o的最短子串
 */
public class hiho数组 {
	public static void main(String[] args) {
		String s = "hihhohiiohahcd";
		int len = hiho(s);
		System.out.println(len);
	}
	public static int hiho(String s) {
		int min = Integer.MAX_VALUE;
		for(int l = 0;l<s.length();l++) {
		while(l<s.length()) {
			if(check(s.charAt(l))) {
				break;
			}
			l++;
		}
		int r = l+1;
		while(r<s.length()) {
			if(checkAll(s.substring(l,r))) {
				if((r-l)<min) {
					min = r-l;
					break;
				}
			}
			r++;
		}
		}
		return min;
	}
	public static boolean checkAll(String s) {
		int a = 0,b = 0,c = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)=='h') a++;
			if(s.charAt(i)=='i') b++;
			if(s.charAt(i)=='o') c++;
		}
		return a==2&&b==1&&c==1;
	}
	public static boolean check(char c) {
		return c=='h'||c=='i'||c=='o';
	}
}
