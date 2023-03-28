package DFS;

public class n»Êºó {
	static final int n = 8;
	static int[] arr = new int[9];
	static int res = 0;

	public static void main(String[] args) {
		dfs(1);
		System.out.println(res);
	}
	public static void dfs(int index) {
		if(index==n+1) {
			res++;
			return;
		}
		for(int i = 1;i<=n;i++) {
			boolean b = check(index,i);
			if(b) {
				arr[index] = i;
				dfs(index+1);
				//arr[index] = 0;
			}
		}
	}
	public static boolean check(int index,int i) {
		for(int j = 1;j<index;j++) {
			if((arr[j]==i)||(j+arr[j]==index+i)||(j-arr[j]==index-i)) return false;
		}
		return true;
	}
}
