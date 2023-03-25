package DFS;

class 解数独 {
    public void solveSudoku(char[][] board) {
        dfs(board,0,0);
    }
    private static boolean dfs(char[][] table, int x, int y) {
        if(x==9) return true;
        if(y==9){
            return dfs(table,x+1,0);
        }
        if(table[x][y]!='.'){
            return dfs(table,x,y+1);
        }
        for(char k = '1';k<='9';k++){
            if(check(table,x,y,k)){
                table[x][y] = k;
                if(dfs(table,x,y+1)){
                return true;
                }
            }
            table[x][y] = '.';//回溯
        }
        return false;
	}
    private static boolean check(char[][] board, int i, int j, char c) {
	    //检查同行和同列
	    for(int k = 0; k < 9; k++){
            if(board[i][k] == c){
                return false;
            }
            if(board[k][j] == c){
                return false;
            }
            // ⭐代码简洁优化：判断3*3的方格里是否有重复
            if(board[(i/3)*3 + k/3][(j/3)*3 + k%3] == c){
                return false;
            }
        }
	    //检查小九宫格
	    return true;
	  }
}
