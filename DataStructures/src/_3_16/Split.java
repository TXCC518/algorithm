package _3_16;
/*
 * ˼�������ַ�����abc��123��defe��dbfv��4560���԰Ѹ��ַ����ԡ�����Ϊ�ָ����ֽ�5���ַ�����
 * ����������������ɵ��ַ����ҳ�������Щ�����ַ���ת��Ϊ����������Щ���ĺ͡�
��ʾ��
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
