package DFS;
import java.util.*;
/*
��һ����СΪ N*M ��԰�ӣ���������ˮ������ͨ�Ļ�ˮ����Ϊ��������һ��ġ������
԰�����ܹ��ж���ˮ�ݣ�������ָͨ������ͼ����� W ��*�Ĳ��֣�
    ***
    *W*
    ***
��������
 N, M �� 100
 ����:
 ����
    N=10, M=12
԰������ͼ��'W'��ʾ��ˮ�� '.'��ʾû�л�ˮ��
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
���
    3
 */
public class ˮ���� {
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
