package recursion;
/**
有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。
请实现一个方法，计算小孩有多少种上楼的方式。
为了防止溢出，请将结果Mod 1000000007
给定一个正整数int n，请返回一个数，代表上楼的方式数。
保证n小于等于100000。
*/
public class 走楼梯 {
	static final int mol = 1000000007;
	public static void main(String[] args) {
		System.out.println(solve1(15));
		System.out.println(solve1(15));
	}
	//递归法
	public static int solve1(int n) {
		if(n<0) return 0;
		if(n==0||n==1) return 1;
		if(n==2) return 2;
		return solve1(n-1)%mol+solve1(n-2)%mol+solve1(n-3)%mol;
	}
	//迭代法
	public static int solve2(int n) {
		if(n<0) return 0;
		if(n==0||n==1) return 1;
		if(n==2) return 2;
		int x1 = 1;
		int x2 = 2;
		int x3 = 4;
		for(int i = 4;i<=n;i++) {
			int temp = x1%mol;
			x1 = x2%mol;
			x2 = x3%mol;
			x3 = (temp+x1+x2)%mol;
		}
		return x3;
	}
}
