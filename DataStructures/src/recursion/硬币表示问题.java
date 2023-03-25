package recursion;
/**
 * 假设我们有8种不同面值的硬币｛1，2，5，10，20，50，100，200｝，用这些硬币组合构成一个给定的数值n。
 * 例如n=200，那么一种可能的组合方式为 200 = 3 * 1 + 1＊2 + 1＊5 + 2＊20 + 1 * 50 + 1 * 100.
 * 问总共有多少种可能的组合方式？ (这道题目来自著名编程网站ProjectEuler) 类似的题目还有：
 　　[华为面试题] 1分2分5分的硬币三种，组合成1角，共有多少种组合
 1*x + 2*y + 5*z=10
 　　[创新工厂笔试题] 有1分，2分，5分，10分四种硬币，每种硬币数量无限，给定n分钱，有多少组合可以组成n分钱
 1 5 10 25 分 n,多少种组合方法.
 */
public class 硬币表示问题 {
	public static void main(String[] args) {
		int[] arr = {1,2,5,10,20,50,100,200};
		System.out.println(硬币表示问题.solve1(200,arr,arr.length-1));
		System.out.println(硬币表示问题.solve2(200,arr));
	}
	//递归法
	public static int solve1(int n,int[] arr,int cur) {
		if(cur==0) return 1;
		int res = 0;
		for(int i = 0;i*arr[cur]<=n;i++) {
			int surplus = n-i*arr[cur];
			res += solve1(surplus,arr,cur-1);
		}
		return res;
	}
	//迭代法
	public static int solve2(int n,int[] arr) {
		int[][] dp = new int[arr.length][n+1];	//创建二维数组，横表示不同面值，纵表示数值n
		for(int i = 0;i<arr.length;i++) {	//n==1时，只有“1”面值一种方法
			dp[i][0] = 1;
		}
		for(int i = 0;i<=n;i++) {	//面值为1时，不管n为多大都只有一种方法
			dp[0][i] = 1;
		}
		for(int i = 1;i<arr.length;i++) {
			for(int j = 1;j<=n;j++) {
				for(int k = 0;k*arr[i]<=j;k++) {
					dp[i][j] += dp[i-1][j-k*arr[i]];
				}
			}
		}
		return dp[arr.length-1][n];
	}
}
