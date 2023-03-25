package algorithm;

import java.util.Scanner;

/*X����Ŀ���ѧ�ҷ�����һ���Ŵ������������롣
��Щ��������A��B��C��D ����ֲ������Ӵ��ɵ����С�
��ϸ�������֣���Щ���봮����Ӧ����ǰ��ԳƵģ�Ҳ��������˵�ľ��񴮣���
���������Զ������������������ˣ�������ܻ�ʧȥ�����������

��������ǣ�
����һ�����ڿ��������봮������һ�´ӵ�����״̬����Ҫ����������ٸ����ӣ��ſ��ܻ������ڵ����ӡ�

����һ�У���ʾ���ڿ��������봮�����Ȳ�����1000��
Ҫ�����һ������������ʾ���������˶��ٸ����ӡ�

���磬���룺
ABCBA
�����Ӧ�������
0

�����磬���룺
ABDCDCBABC
�����Ӧ�������
3
*/
public class �������� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] arr = sc.next().toCharArray();
		int num = 0;
		int left = 0;
		int right = arr.length-1;
		while(left<=right) {
			int m = 0;
			int n = 0;
			if(arr[left] == arr[right]) {
				left++;
				right--;
			}else {
				int t1 = left;
				while(arr[t1] != arr[right]) {
					m++;
					t1++;
				}
				int t2 = right;
				while(arr[t2] != arr[left]) {
					n++;
					t2--;
				}
				if(n<m) {
					right -= n;
				}else {
					left += m;
				}
				num += n<m?n:m;
			}
		}
		System.out.println(num);
	}
}	
