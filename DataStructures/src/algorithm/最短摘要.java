package algorithm;

import java.util.Arrays;

/*
下面是阿里巴巴2011年的一个笔试题，也是关于最短摘要的问题。

给定一段产品的英文描述，包含M个英文字母，每个英文单词以空格分隔，无其他标点符号；
再给定N个英文单词关键字，请说明思路并编程实现方法String extractSummary(String description,String[] key words)，
目标是找出此产品描述中包含N个关键字（每个关键词至少出现一次）的长度最短的子串，作为产品简介输出。（不限编程语言）20分。

解法思路：
这题可以用暴力法破解，以每一个单词作为起点，开始向后扫描，当包含N个关键字时就与之前得到的最短字符串进行比较，如果更短就替换。
否则开始下一个起点的扫描。但是这个方法时间复杂度很高为：MMN

这题用尺取法的话可以提高效率，尺取法通常是指保留数组的一对下标（起点和终点），然后根据实际情况交替推进两个端点直到得出答案。
这种操作很像尺取虫的爬行方式，故而得名。
结合本题的实际情况就是：从第一个单词开始扫描，直到碰到关键字就记录它的下标作为起点，
然后终点下标接着向后扫描直到起点和终点之间的字符串包含了所有关键字，记录下起点和终点，然后起点向后移动终点不变，
如果还是包含所有关键字就记录起点和终点下标；直到不能包含所有关键字时起点不动终点向后移。
又直到包含所有关键字时终点停下记录起点和终点的下标。如此一直循环到字符串结束。
从所有记录中找到最短的记录（也可以在记录的时候进行比较，如果更短就进行更新记录，这样可以省空间）。

 */
public class 最短摘要 {
	public static void main(String[] args) {
		String[] test = {"b","b","c","e","a","f","g"};
		String[] keys = {"a","b","c"};
		solve(test,keys);
	}
	public static void solve(String[] test,String[] keys) {
		int start = -1;
		int end = -1;
		int p = -1;
		int minlen = Integer.MAX_VALUE;
		int[] keyFound = new int[keys.length];
		for(int i = 0;i<test.length;i++) {
			String word = test[i];
			int index = indexOf(keys,word);
			if(index == -1) {
				continue;
			}else {
				keyFound[index] = 1;
			}
			int j = 0;
			if(p == -1) {
				j = i+1;
			}else {
				j = p;
			}
			for(;j<test.length;j++) {
				String word2 = test[j];
				int index2 = indexOf(keys,word2);
				if(index2 == -1||keyFound[index2]==1) {
					continue;
				}else {
					keyFound[index2] = 1;
				}
				if(sumOf(keyFound) == keys.length) {
					p = j;
					int len = j - i +1;
					if(len<minlen) {
						start = i;
						end = j;
						minlen = len;
					}
					keyFound[index] = 0;
					keyFound[index2] = 0;
					break;
				}
			}
		}
		print(test,start,end);
	}
	public static void print(String[] test,int start,int end) {
		for(int i = start;i<=end;i++) {
			System.out.print(test[i]+" ");
		}
	}
	public static int indexOf(String[] keys,String word) {
		for(int i = 0;i<keys.length;i++) {
			if(word.equals(keys[i])) {
				return i;
			}
		}
		return -1;
	}
	public static int sumOf(int[] keyFound) {
		int num = 0;
		for(int i = 0;i<keyFound.length;i++) {
			num += keyFound[i];
		}
		return num;
	}
}
