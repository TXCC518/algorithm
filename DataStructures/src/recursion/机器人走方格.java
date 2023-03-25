package recursion;
/**
有一个X*Y的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角。
请设计一个算法，计算机器人有多少种走法。
给定两个正整数int x,int y，请返回机器人的走法数目。保证x＋y小于等于12。
*/
public class 机器人走方格 {
	public static void main(String[] args) {
		System.out.println(solve1(3,3));
		System.out.println(solve2(3,3));
	}
	//递归法
	public static int solve1(int m,int n) {
		if(m==1||n==1) return 1;
		return solve1(m-1,n)+solve1(m,n-1);
	}
	//迭代法
	public static int solve2(int m,int n) {
		int[][] arr = new int[m+1][n+1];
		for(int i = 1;i<=m;i++) {
			arr[i][1] = 1;
		}
		for(int i = 1;i<=n;i++) {
			arr[1][i] = 1;
		}
		for(int i = 2;i<=m;i++) {
			for(int j = 2;j<=n;j++) {
				arr[i][j] = arr[i-1][j]+arr[i][j-1];
			}
		}
		return arr[m][n];
	}
}
