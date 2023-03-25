package algorithm;

public class KMP×Ö·û´®Æ¥Åä {
	public static void main(String[] args) {
		String s = "abcabcabcabc";
		String p = "abc";
		System.out.println(KMP(s,p));
	}
	public static int KMP(String s,String p) {
		if(s.length()==0||p.length()==0||s.length()<p.length()) {
			return -1;
		}
		int count = 0;
		int l = 0;
		int r = 0;
		int slen = s.length();
		int plen = p.length();
		int[] next = findNext(p);
		while(l<=slen-1) {
			if(next[r]==-1||s.charAt(l)==p.charAt(r)) {
				l++;
				r++;
			}else {
				r = next[r];
			}  
			if(r == plen) {
				count++;
				l--;
				r = next[r-1];
			}
		}
		return count;
	}
	public static int[] findNext(String p) {
		int plen = p.length();
		int[] next = new int[plen];
		next[0] = -1;
		if(plen == 1) {
			return next;
		}else {
			next[1] = 0;
		}
		int i = 1;
		int k = next[i];
		while(i<plen-1) {
			if(k == -1||p.charAt(i)==p.charAt(k)) {
				next[++i] = ++k;
			}else {
				k = next[k]; 
			}
		}
		return next;
	}
}
