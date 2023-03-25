package algorithm;

import java.util.Arrays;

/*
�����ǰ���Ͱ�2011���һ�������⣬Ҳ�ǹ������ժҪ�����⡣

����һ�β�Ʒ��Ӣ������������M��Ӣ����ĸ��ÿ��Ӣ�ĵ����Կո�ָ��������������ţ�
�ٸ���N��Ӣ�ĵ��ʹؼ��֣���˵��˼·�����ʵ�ַ���String extractSummary(String description,String[] key words)��
Ŀ�����ҳ��˲�Ʒ�����а���N���ؼ��֣�ÿ���ؼ������ٳ���һ�Σ��ĳ�����̵��Ӵ�����Ϊ��Ʒ�������������ޱ�����ԣ�20�֡�

�ⷨ˼·��
��������ñ������ƽ⣬��ÿһ��������Ϊ��㣬��ʼ���ɨ�裬������N���ؼ���ʱ����֮ǰ�õ�������ַ������бȽϣ�������̾��滻��
����ʼ��һ������ɨ�衣�����������ʱ�临�ӶȺܸ�Ϊ��MMN

�����ó�ȡ���Ļ��������Ч�ʣ���ȡ��ͨ����ָ���������һ���±꣨�����յ㣩��Ȼ�����ʵ����������ƽ������˵�ֱ���ó��𰸡�
���ֲ��������ȡ������з�ʽ���ʶ�������
��ϱ����ʵ��������ǣ��ӵ�һ�����ʿ�ʼɨ�裬ֱ�������ؼ��־ͼ�¼�����±���Ϊ��㣬
Ȼ���յ��±�������ɨ��ֱ�������յ�֮����ַ������������йؼ��֣���¼�������յ㣬Ȼ���������ƶ��յ㲻�䣬
������ǰ������йؼ��־ͼ�¼�����յ��±ꣻֱ�����ܰ������йؼ���ʱ��㲻���յ�����ơ�
��ֱ���������йؼ���ʱ�յ�ͣ�¼�¼�����յ���±ꡣ���һֱѭ�����ַ���������
�����м�¼���ҵ���̵ļ�¼��Ҳ�����ڼ�¼��ʱ����бȽϣ�������̾ͽ��и��¼�¼����������ʡ�ռ䣩��

 */
public class ���ժҪ {
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
