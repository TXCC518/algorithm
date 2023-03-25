package recursion;

import java.util.Arrays;

public class 全排列III_排列序列 {
	static int k = 3;
	static int count = 0;
	public static void main(String[] args) {
		String s = "DCBA";
		char[] arr = s.toCharArray();
		Arrays.sort(arr);
		solve("",arr);
	}
	public static void solve(String preString,char[] arr) {
		if(preString.length()==arr.length) {
			count++;
			if(count==k) {
				System.out.println(preString);
				return;
			}
		}
		for(int i = 0;i<arr.length;i++) {
			char ch = arr[i];
			if(findNum(preString,ch)<findNum(arr,ch)) {
				solve(preString+ch,arr);
			}
		}
	}
	public static int findNum(String s,char ch) {
		int num =0;
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)==ch) {
				num++;
			}
		}
		return num;
	}
	public static int findNum(char[] arr,char ch) {
		int num = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==ch) {
				num++;
			}
		}
		return num;
	}
}
