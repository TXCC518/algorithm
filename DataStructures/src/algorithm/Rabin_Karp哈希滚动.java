package algorithm;

public class Rabin_Karp¹þÏ£¹ö¶¯ {
	final static long seed = 31;
	public static void main(String[] args) {
		String test = "ABCDEFABC";
		String key = "ABC";
		solve(test,key);
	}
	public static void solve(String test,String key) {
		int m = test.length();
		int n = key.length();
		long[] arr = hash(test,m,n);
		long value = hash(key);
		for(int i = 0;i<arr.length;i++) {
			if(arr[i] == value) {
				if(key.equals(test.substring(i,i+n))) {
				System.out.println("index:"+i);
				}
			}
		}
	}
	public static long[] hash(String test,int m,int n) {
		long[] arr = new long[m-n+1];
		arr[0] = hash(test.substring(0,n));
		for(int i = n;i<m;i++) {
			char newChar = test.charAt(i);
			char oldChar = test.charAt(i-n);
			arr[i-n+1] = (arr[i-n]*seed + newChar - numOf(n)*oldChar)%Long.MAX_VALUE;
		}
		return arr;
	}
	public static long hash(String key) {
		long hash = 0;
		for(int i = 0;i<key.length();i++) {
			hash = seed*hash + key.charAt(i);
		}
		return hash%Long.MAX_VALUE;
	}
	public static long numOf(int n) {
		int num = 1;
		for(int i = 0;i<n;i++) {
			num *= seed;
		}
		return num;
	}
}
