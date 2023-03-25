package algorithm;
/*一共有N堆石子，编号1..n，第i堆中有a[i]个石子。
 * 每一次操作Alice和Bob可以从任意一堆石子中取出任意数量的石子，
 * 至少取一颗，至多取出这一堆剩下的所有石子。
 * 两个人轮流行动，取光所有石子的一方获胜。Alice为先手。
 * 
 * 给定a，假设两人都采用最优策略，谁会获胜？
 */
public class Nim游戏 {
	public static void main(String[] args) {
		int[] arr = {3,4,5};
		boolean res = solve(arr);
		System.out.println(res);
	}
	public static boolean solve(int[] arr) {
		int res = 0;
		for(int i = 0;i<arr.length;i++) {
			res ^= arr[i];
		}
		return res!=0;
	}
}
