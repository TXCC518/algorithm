package recursion;
import java.util.*;
/**
 * 编写一个方法，确定某字符串的所有排列组合。
 给定一个string A和一个int n,代表字符串和其长度，请返回所有该字符串字符的排列，
 保证字符串长度小于等于11且字符串中字符均为大写英文字符，
 */
public class 全排列I {
	public static void main(String[] args) {
		String A = "ABCD";
		int n = A.length();
		System.out.println(solve1(A,n));
		System.out.println(solve2(A,n-1));
	}
	//迭代法
	public static List<String> solve1(String A,int n){
		List<String> list =new ArrayList<>();
		list.add(A.charAt(0)+"");
		for(int i = 1;i<n;i++) {
			List<String> temp = new ArrayList<>();
			for(String s : list) {
				temp.add(A.charAt(i)+s);
				temp.add(s+A.charAt(i));
				for(int j = 1;j<s.length();j++) {
					temp.add(s.substring(0,j)+A.charAt(i)+s.substring(j,s.length()));
				}
			}
			list = temp;
		}
		return list;
	}
	//递归法
	public static List<String> solve2(String A,int n){
		List<String> list = new ArrayList<>();
		if(n==0) {
			list.add(A.charAt(0)+"");
			return list;
		}
		List<String> old = solve2(A,n-1);
		for(String s : old) {
			list.add(A.charAt(n)+s);
			list.add(s+A.charAt(n));
			for(int j = 1;j<s.length();j++) {
				list.add(s.substring(0,j)+A.charAt(n)+s.substring(j,s.length()));
			}
		}
		return list;
	}
}
