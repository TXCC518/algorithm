package DFS;
import java.util.*;

public class ���� {
	  public static void main(String[] args) {
	    // System.out.println((char)('0'+1));
	    Scanner sc = new Scanner(System.in);
	    char[][] table = new char[9][];
	    for (int i = 0; i < 9; i++) {
	      table[i] = sc.nextLine().toCharArray();
	    }
	    dfs(table, 0, 0);
	  }

	  private static boolean dfs(char[][] table, int x, int y) {
	    if (x == 9) {
	      return true;
	    }
	    if (table[x][y] == '0') {//��λ�Դ�
	      for (int k = 1; k < 10; k++) {
	        if (check(table, x, y, k)) {
	          // f = false;
	          table[x][y] = (char) ('0' + k);
	          if(dfs(table, x + (y + 1) / 9, (y + 1) % 9))//������һ��״̬
	        	  return true;
	        	}
	        table[x][y] = '0';//����
	      }
	    } else {
	      return dfs(table, x + (y + 1) / 9, (y + 1) % 9);//������һ��״̬
	    }
	    return false;
	  }
	  private static boolean check(char[][] table, int i, int j, int k) {
	    //���ͬ�к�ͬ��
	    for (int l = 0; l < 9; l++) {
	      if (table[i][l] == (char) ('0' + k)) return false;
	      if (table[l][j] == (char) ('0' + k)) return false;
	    }
	    //���С�Ź���
	    for (int l = (i / 3) * 3; l < (i / 3 + 1) * 3; l++) {
	      for (int m = (j / 3) * 3; m < (j / 3 + 1) * 3; m++) {
	        if (table[l][m] == (char) ('0' + k)) return false;
	      }
	    }
	    return true;
	  }

	}
