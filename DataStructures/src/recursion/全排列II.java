package recursion;
import java.util.*;
/**
 * ��дһ��������ȷ��ĳ�ַ���������������ϡ�
 ����һ��string A��һ��int n,�����ַ������䳤�ȣ��뷵�����и��ַ����ַ������У�
 ��֤�ַ�������С�ڵ���11���ַ������ַ���Ϊ��дӢ���ַ���
 �����е��ַ������ֵ���Ӵ�С����(���ϲ��ظ��ַ���)
 */
public class ȫ����II {
	static List<String> list = new ArrayList<>();
	public static void main(String[] args) {
		String A = "DCBA";
		char[] arr = A.toCharArray();
		Arrays.sort(arr);
		solve(arr,0);
		System.out.println(list);
	}
	public static void solve(char[] arr,int n) {
		if(n==arr.length) {
			list.add(new String(arr));
		}
		for(int i = n;i<arr.length;i++) {
			swap(arr,i,n);
			solve(arr,n+1);
			swap(arr,i,n);
		}
	}
	public static void swap(char[] arr,int i,int n) {
		char temp = arr[i];
		arr[i] = arr[n];
		arr[n] = temp;
	}
}
