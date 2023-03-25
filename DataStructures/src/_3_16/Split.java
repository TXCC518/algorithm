package _3_16;
/*
 * 思考：有字符串“abc：123：defe：dbfv：4560”试把该字符串以“：”为分隔符分解5个字符串，
 * 并把其中由数字组成的字符串找出，把这些数字字符串转换为整数，求这些数的和。
提示：
 */
public class Split {
	public static void main(String[] args) {
		String s = "abc:123:defe:dbfv:4560";
		String[] arr = s.split(":");
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			String temp = arr[i];
			for(int j = 0;j<temp.length();j++) {
				char c = temp.charAt(j);
				if(c<48||c>57) break;
				if(j==temp.length()-1) {
					sum += Integer.parseInt(temp);
				}
			}
		}
		System.out.println(sum);
	}
}
