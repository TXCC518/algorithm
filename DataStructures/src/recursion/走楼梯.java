package recursion;
/**
�и�С��������¥�ݣ�¥����n��̨�ף�С��һ�ο�����1�ס�2�ס�3�ס�
��ʵ��һ������������С���ж�������¥�ķ�ʽ��
Ϊ�˷�ֹ������뽫���Mod 1000000007
����һ��������int n���뷵��һ������������¥�ķ�ʽ����
��֤nС�ڵ���100000��
*/
public class ��¥�� {
	static final int mol = 1000000007;
	public static void main(String[] args) {
		System.out.println(solve1(15));
		System.out.println(solve1(15));
	}
	//�ݹ鷨
	public static int solve1(int n) {
		if(n<0) return 0;
		if(n==0||n==1) return 1;
		if(n==2) return 2;
		return solve1(n-1)%mol+solve1(n-2)%mol+solve1(n-3)%mol;
	}
	//������
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
