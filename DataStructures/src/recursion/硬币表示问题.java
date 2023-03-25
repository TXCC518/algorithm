package recursion;
/**
 * ����������8�ֲ�ͬ��ֵ��Ӳ�ң�1��2��5��10��20��50��100��200��������ЩӲ����Ϲ���һ����������ֵn��
 * ����n=200����ôһ�ֿ��ܵ���Ϸ�ʽΪ 200 = 3 * 1 + 1��2 + 1��5 + 2��20 + 1 * 50 + 1 * 100.
 * ���ܹ��ж����ֿ��ܵ���Ϸ�ʽ�� (�����Ŀ�������������վProjectEuler) ���Ƶ���Ŀ���У�
 ����[��Ϊ������] 1��2��5�ֵ�Ӳ�����֣���ϳ�1�ǣ����ж��������
 1*x + 2*y + 5*z=10
 ����[���¹���������] ��1�֣�2�֣�5�֣�10������Ӳ�ң�ÿ��Ӳ���������ޣ�����n��Ǯ���ж�����Ͽ������n��Ǯ
 1 5 10 25 �� n,��������Ϸ���.
 */
public class Ӳ�ұ�ʾ���� {
	public static void main(String[] args) {
		int[] arr = {1,2,5,10,20,50,100,200};
		System.out.println(Ӳ�ұ�ʾ����.solve1(200,arr,arr.length-1));
		System.out.println(Ӳ�ұ�ʾ����.solve2(200,arr));
	}
	//�ݹ鷨
	public static int solve1(int n,int[] arr,int cur) {
		if(cur==0) return 1;
		int res = 0;
		for(int i = 0;i*arr[cur]<=n;i++) {
			int surplus = n-i*arr[cur];
			res += solve1(surplus,arr,cur-1);
		}
		return res;
	}
	//������
	public static int solve2(int n,int[] arr) {
		int[][] dp = new int[arr.length][n+1];	//������ά���飬���ʾ��ͬ��ֵ���ݱ�ʾ��ֵn
		for(int i = 0;i<arr.length;i++) {	//n==1ʱ��ֻ�С�1����ֵһ�ַ���
			dp[i][0] = 1;
		}
		for(int i = 0;i<=n;i++) {	//��ֵΪ1ʱ������nΪ���ֻ��һ�ַ���
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
