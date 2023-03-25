package recursion;

import java.util.*;

/**
���дһ������������ĳ���ϵ����зǿ��Ӽ���
����һ��int����A������Ĵ�Сint n���뷵��A�����зǿ��Ӽ���
��֤A��Ԫ�ظ���С�ڵ���20����Ԫ�ػ��졣
���Ӽ��ڲ��Ӵ�С����,�Ӽ�֮���ֵ���������
*/
public class �ǿ��Ӽ� {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(solve1(arr,arr.length-1));
		System.out.println(solve2(arr,arr.length));
	}
	//�ݹ鷨
	public static Set<Set<Integer>> solve1(int[] arr,int cur){
		Set<Set<Integer>> newSet = new HashSet<>();
		if(cur==0) {
			Set<Integer> first = new HashSet<>();
			Set<Integer> nil = new HashSet<>();
			first.add(arr[cur]);
			newSet.add(nil);
			newSet.add(first);
			return newSet;
		}
		Set<Set<Integer>> oldSet = solve1(arr,cur-1);
		newSet.addAll(oldSet);
		for(Set<Integer> set : oldSet) {
			Set clone = (Set)((HashSet) set).clone();
			clone.add(arr[cur]);
			newSet.add(clone);
		}
		return newSet;
	}
	//������
	public static Set<Set<Integer>> solve2(int[] arr,int n){
		Set<Set<Integer>> res = new HashSet<>();
		res.add(new HashSet<>());
		for(int i = 0;i<n;i++) {
			Set<Set<Integer>> temp = new HashSet<>();
			temp.addAll(res);
			for(Set<Integer> set : res) {
				Set clone = (Set)((HashSet) set).clone();
				clone.add(arr[i]);
				temp.add(clone);
			}
			res = temp;
		}
		return res;
	}
}
