package DFS;

import java.util.*;

/*
给定整数序列a1,a2,...,an,判断是否可以从中选出若干数,使它们的和恰好为k.
    1≤n≤20
    -10^8≤ai≤10^8
    -10^8≤k≤10^8
样例:
输入
    n=4
    a={1,2,4,7}
    k=13
输出:
    Yes (13 = 2 + 4 + 7)
*/
public class 部分和 {
	static int kk;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		kk = k;
		dfs(k,0,arr,new ArrayList<Integer>());
		sc.close();
	}
	public static void dfs(int k,int cur,int[] arr,ArrayList<Integer> list) {
		if(k==0) {
			System.out.print("Yes("+kk+"=");
			for(int i = 0;i<list.size();i++) {
				System.out.print(list.get(i)+(i==list.size()-1?")":"+"));
			}
			System.exit(0);
		}
		if(cur==arr.length||k<0) return;
		dfs(k,cur+1,arr,list);
		list.add(arr[cur]);
		int index = list.size()-1;
		dfs(k-arr[cur],cur+1,arr,list);
		list.remove(index);
	}
}
