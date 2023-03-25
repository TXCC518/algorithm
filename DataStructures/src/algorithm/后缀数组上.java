package algorithm;

import java.util.Arrays;

public class 后缀数组上 {
	public static void main(String[] args) {
		String s = "ABABBAABAAAB";
		String p = "AAB";
		int index = solve(s,p);
		System.out.println("index:"+index);
	}
	public static int solve(String s,String p) {
		int slen = s.length();
		int plen = p.length();
		Suff[] suff = new Suff[slen];
		for(int i = 0;i<suff.length;i++) {
			suff[i] = new Suff(s.substring(i),i);
		}
		Arrays.sort(suff);
		int l = 0;
		int r = slen-1;
		while(l<=r) {
			int mid = l + (r-l)/2;
			int res = 0;
			String sufft = suff[mid].str;
			if(sufft.length()>=plen) {
				res = sufft.substring(0,plen).compareTo(p);
			}else {
				res = sufft.compareTo(p);
			}
			if(res == 0) {
				return suff[mid].index;
			}else if(res<0) {
				l = mid + 1;
			}else {
				r = mid - 1;
			}
		}
		return -1;
	}
}
class Suff implements Comparable<Suff>{
	String str;
	int index;
	public Suff() {
		
	}
	public Suff(String str,int index) {
		this.str = str;
		this.index = index;
	}
	@Override
	public int compareTo(Suff o) {
		// TODO Auto-generated method stub
		return this.str.compareTo(o.str);
	}
}
