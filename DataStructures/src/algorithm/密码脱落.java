package algorithm;

import java.util.Scanner;

/*X星球的考古学家发现了一批古代留下来的密码。
这些密码是由A、B、C、D 四种植物的种子串成的序列。
仔细分析发现，这些密码串当初应该是前后对称的（也就是我们说的镜像串）。
由于年代久远，其中许多种子脱落了，因而可能会失去镜像的特征。

你的任务是：
给定一个现在看到的密码串，计算一下从当初的状态，它要至少脱落多少个种子，才可能会变成现在的样子。

输入一行，表示现在看到的密码串（长度不大于1000）
要求输出一个正整数，表示至少脱落了多少个种子。

例如，输入：
ABCBA
则程序应该输出：
0

再例如，输入：
ABDCDCBABC
则程序应该输出：
3
*/
public class 密码脱落 {
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
