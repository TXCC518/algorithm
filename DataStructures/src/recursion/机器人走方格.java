package recursion;
/**
��һ��X*Y������һ��������ֻ���߸����ֻ�����һ������ߣ�Ҫ�����Ͻ��ߵ����½ǡ�
�����һ���㷨������������ж������߷���
��������������int x,int y���뷵�ػ����˵��߷���Ŀ����֤x��yС�ڵ���12��
*/
public class �������߷��� {
	public static void main(String[] args) {
		System.out.println(solve1(3,3));
		System.out.println(solve2(3,3));
	}
	//�ݹ鷨
	public static int solve1(int m,int n) {
		if(m==1||n==1) return 1;
		return solve1(m-1,n)+solve1(m,n-1);
	}
	//������
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
