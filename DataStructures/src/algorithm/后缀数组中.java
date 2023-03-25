package algorithm;

import java.util.Arrays;

public class 后缀数组中 {
	public static void main(String[] args) {
		String s = "ABCABCAC";
		String p = "BC";
		solve(s,p);
	}
	public static void solve(String s,String p) {
		int slen = s.length();
		int plen = p.length();
		Suff2[] suff2 = findSuff2(s,p);
		int l = 0;
		int r = slen-1;
		while(l<=r) {
			int mid = l + (r-l)/2;
			String str = suff2[mid].str;
			int res;
			if(str.length()>=p.length()) {
				res = str.substring(0,plen).compareTo(p);
			}else {
				res = str.compareTo(p);
			}
			if(res == 0) {
				System.out.println("index:"+suff2[mid].index);
				break;
			}else if(res < 0) {
				l = mid + 1;
			}else {
				r = mid - 1;
			}
		}
	}
	public static Suff2[] findSuff2(String s,String p) {
		int slen = s.length();
		int plen = p.length();
		Suff2[] suff2 = new Suff2[slen];
		int[] rk = new int[slen];
		for(int k = 1;k<=slen;k*=2) {
			for(int i= 0;i<slen;i++) {
				String temp = s.substring(i,i+k<=slen?i+k:slen);
				suff2[i] = new Suff2(temp,i);
			}
			if(k == 1) {
				Arrays.sort(suff2);
			}else {
				int kk = k;
				Arrays.sort(suff2,(o1,o2)->{
					int r = o1.index;
					int j = o2.index;
					if(rk[r] == rk[j]) {
						try {
							return rk[r+kk/2]-rk[j+kk/2];
						}catch(ArrayIndexOutOfBoundsException c) {
							return o1.str.length()-o2.str.length();
						}
					}else {
						return rk[r]-rk[j];
					}
				});
			}
			int r = 0;
			rk[suff2[0].index] = 0;
			for(int j = 1;j<slen;j++) {
				if(suff2[j].compareTo(suff2[j-1])==0) {
					rk[suff2[j].index] = r;
				}else {
					rk[suff2[j].index] = ++r;
				}
			}
		}
		return suff2;
	}
}
class Suff2 implements Comparable<Suff2>{
	String str;
	int index;
	public Suff2(){
		
	}
	public Suff2(String str,int index) {
		this.str = str;
		this.index = index;
	}
	public int compareTo(Suff2 o) {
		return str.compareTo(o.str);
	}
}
