package recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.����Ϸ����������
 * �������Ŷ���
 * ������кϷ����
 * ����:3
 * ���:()()(),((())),(()()),()(()),(())(),
 * 2.�ж�һ���ַ����Ƿ�Ϸ�
 */
public class �Ϸ����� {
	public static void main(String[] args) {
		System.out.println(solve1(3));
		System.out.println(solve2(3));
	}
	//�ݹ鷨
	public static Set<String> solve1(int n){
		Set<String> cur = new HashSet<>();
		if(n==1) {
			cur.add("()");
			return cur;
		}
		Set<String> temp = solve1(n-1);
		for(String s : temp) {
			cur.add("()"+s);
			cur.add(s+"()");
			cur.add("("+s+")");
		}
		return cur;
	}
	//������
	public static Set<String> solve2(int n){
		Set<String> res = new HashSet<>();
		res.add("()");
		if(n==1) return res;
		for(int i = 2;i<=n;i++) {
			Set<String> temp = new HashSet<>();
			for(String s : res) {
				temp.add("()"+s);
				temp.add(s+"()");
				temp.add("("+s+")");
			}
			res = temp;
		}
		return res;
	}
}
