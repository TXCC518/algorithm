package recursion;

import java.util.*;

/**
请编写一个方法，返回某集合的所有非空子集。
给定一个int数组A和数组的大小int n，请返回A的所有非空子集。
保证A的元素个数小于等于20，且元素互异。
各子集内部从大到小排序,子集之间字典逆序排序
*/
public class 非空子集 {
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		System.out.println(solve1(arr,arr.length-1));
		System.out.println(solve2(arr,arr.length));
	}
	//递归法
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
	//迭代法
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
