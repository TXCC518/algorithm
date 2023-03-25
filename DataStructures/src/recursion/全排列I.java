package recursion;
import java.util.*;
/**
 * ��дһ��������ȷ��ĳ�ַ���������������ϡ�
 ����һ��string A��һ��int n,�����ַ������䳤�ȣ��뷵�����и��ַ����ַ������У�
 ��֤�ַ�������С�ڵ���11���ַ������ַ���Ϊ��дӢ���ַ���
 */
public class ȫ����I {
	public static void main(String[] args) {
		String A = "ABCD";
		int n = A.length();
		System.out.println(solve1(A,n));
		System.out.println(solve2(A,n-1));
	}
	//������
	public static List<String> solve1(String A,int n){
		List<String> list =new ArrayList<>();
		list.add(A.charAt(0)+"");
		for(int i = 1;i<n;i++) {
			List<String> temp = new ArrayList<>();
			for(String s : list) {
				temp.add(A.charAt(i)+s);
				temp.add(s+A.charAt(i));
				for(int j = 1;j<s.length();j++) {
					temp.add(s.substring(0,j)+A.charAt(i)+s.substring(j,s.length()));
				}
			}
			list = temp;
		}
		return list;
	}
	//�ݹ鷨
	public static List<String> solve2(String A,int n){
		List<String> list = new ArrayList<>();
		if(n==0) {
			list.add(A.charAt(0)+"");
			return list;
		}
		List<String> old = solve2(A,n-1);
		for(String s : old) {
			list.add(A.charAt(n)+s);
			list.add(s+A.charAt(n));
			for(int j = 1;j<s.length();j++) {
				list.add(s.substring(0,j)+A.charAt(n)+s.substring(j,s.length()));
			}
		}
		return list;
	}
}
