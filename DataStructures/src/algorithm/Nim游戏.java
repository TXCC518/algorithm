package algorithm;
/*һ����N��ʯ�ӣ����1..n����i������a[i]��ʯ�ӡ�
 * ÿһ�β���Alice��Bob���Դ�����һ��ʯ����ȡ������������ʯ�ӣ�
 * ����ȡһ�ţ�����ȡ����һ��ʣ�µ�����ʯ�ӡ�
 * �����������ж���ȡ������ʯ�ӵ�һ����ʤ��AliceΪ���֡�
 * 
 * ����a���������˶��������Ų��ԣ�˭���ʤ��
 */
public class Nim��Ϸ {
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
