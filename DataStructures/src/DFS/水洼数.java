package DFS;
import java.util.*;
/*
有一个大小为 N*M 的园子，雨后积起了水。八连通的积水被认为是连接在一起的。请求出
园子里总共有多少水洼？（八连通指的是下图中相对 W 的*的部分）
    ***
    *W*
    ***
限制条件
 N, M ≤ 100
 样例:
 输入
    N=10, M=12
园子如下图（'W'表示积水， '.'表示没有积水）
W........WW.
.WWW.....WWW
....WW...WW.
.........WW.
.........W..
..W......W..
.W.W.....WW.
W.W.W.....W.
.W.W......W.
..W.......W.
输出
    3
 */
public class 水洼数 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		char[][] arr = new char[N][M];
		for(int i = 0;i<N;i++) {
			arr[i] = sc.next().toCharArray();
		}
		int res = 0;
		for(int i = 0;i<N;i++) {
			for(int j = 0;j<M;j++) {
				if(arr[i][j]=='W') {
					dfs(arr,i,j);
					res++;
				}
			}
		}
		System.out.println(res);
		sc.close();
	}
	public static void dfs(char[][] arr,int i,int j) {
		arr[i][j] = '.';
		for(int m = -1;m<=1;m++) {
			for(int n = -1;n<=1;n++) {
				if((i+m)>=0&&(i+m)<arr.length&&(j+n)>=0&&(j+n)<arr[0].length) {
					if(arr[i+m][j+n]=='W') {
						dfs(arr,i+m,j+n);
					}
				}
			}
		}
	}
}
