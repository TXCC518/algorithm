package recursion;

import java.util.HashSet;
import java.util.Set;

/**
 * 1.输出合法的括号组合
 * 输入括号对数
 * 输出所有合法组合
 * 输入:3
 * 输出:()()(),((())),(()()),()(()),(())(),
 * 2.判断一个字符串是否合法
 */
public class 合法括号 {
	public static void main(String[] args) {
		System.out.println(solve1(3));
		System.out.println(solve2(3));
	}
	//递归法
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
	//迭代法
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
