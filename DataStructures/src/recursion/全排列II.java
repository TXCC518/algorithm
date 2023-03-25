package recursion;
import java.util.*;
/**
 * 编写一个方法，确定某字符串的所有排列组合。
 给定一个string A和一个int n,代表字符串和其长度，请返回所有该字符串字符的排列，
 保证字符串长度小于等于11且字符串中字符均为大写英文字符，
 排列中的字符串按字典序从大到小排序。(不合并重复字符串)
 */
public class 全排列II {
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) {
		String A = "DCBA";
		char[] arr = A.toCharArray();
		Arrays.sort(arr);
		solve(arr,0);
		System.out.println(list);
	}
	public static void solve(char[] arr,int n) {
		if(n==arr.length) {
			list.add(new String(arr));
		}
		for(int i = n;i<arr.length;i++) {
			swap(arr,i,n);
			solve(arr,n+1);
			swap(arr,i,n);
		}
	}
	public static void swap(char[] arr,int i,int n) {
		char temp = arr[i];
		arr[i] = arr[n];
		arr[n] = temp;
	}
}
