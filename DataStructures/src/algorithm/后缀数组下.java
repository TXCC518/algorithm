package algorithm;

import java.util.Arrays;

public class 后缀数组下 {
	public static void main(String[] args) {
		String s = "ABCAB";
		String p = "AC";
		int[] height = getHeight(s);
		for(int i = 0;i<height.length;i++) {
			System.out.print(height[i]+" ");
		} 
	}
	public static int[] getHeight(String s) {
	    int slen = s.length();
	    Suff3[] suff = getSuff(s);
	    int[] rk = new int[slen];
	    for(int i = 0;i<slen;i++) {
	        rk[suff[i].index] = i;
	    }
	    int[] height = new int[slen];
	    int k = 0;
	    for(int i = 0;i<slen;i++) {
	        int rk_i = rk[i];
	        if(rk_i==0) {
	            height[0] = 0;
	            continue;
	        }
	        int rk_i_1 = rk_i-1;
	        int j = suff[rk_i_1].index;
	        if(k>0) k--;
	        for(;i+k<slen&&j+k<slen;k++) {
	            if(s.charAt(i+k)!=s.charAt(j+k)) {
	                break;
	            }
	        }
	        height[rk_i] = k;
	    }
	    return height;
	}
	public static Suff3[] getSuff(String s) {
	    int slen = s.length();
	    Suff3[] suff = new Suff3[slen];
	    int[] rk = new int[slen];
	    for(int i = 0;i<slen;i++) {
	        suff[i] = new Suff3(s.charAt(i),i,s);
	    }
	    Arrays.sort(suff);
	    rk[suff[0].index] = 1;
	    for(int i = 1;i<slen;i++) {
	        rk[suff[i].index] = rk[suff[i-1].index];
	        if(suff[i].c != suff[i-1].c) {
	            rk[suff[i].index]++;
	        }
	    }
	    for(int k = 2;rk[suff[slen-1].index]<slen;k*=2) {
	        int kk = k;
	        Arrays.sort(suff,(o1,o2)->{
	            int i = o1.index;
	            int j = o2.index;
	            if(rk[i]==rk[j]) {
	                if(i+kk/2>=slen||j+kk/2>=slen) {
	                    return -(i-j);
	                }
	                return rk[i+kk/2]-rk[j+kk/2];
	            }else {
	                return rk[i]-rk[j];
	            }
	        });
	        rk[suff[0].index] = 1;
	        for(int i = 1;i<slen;i++) {
	            int l = suff[i].index;
	            int r = suff[i-1].index;
	            rk[l] = rk[r];
	            try {
	            if(!s.substring(l,l+kk).equals(s.substring(r,r+kk))) {
	                rk[l]++;
	            }
	            }
	            catch(Exception e){
	                rk[l]++;
	            }
	            }
	        }
	    return suff;
	}
}
class Suff3 implements Comparable<Suff3>{
	char c;
	int index;
	String s;
	public Suff3() {
		
	}
	public Suff3(char c,int index,String s) {
		this.c = c;
		this.index = index;
		this.s = s;
	}
	@Override
	public int compareTo(Suff3 o) {
		// TODO Auto-generated method stub
		return this.c - o.c;
	}
}
