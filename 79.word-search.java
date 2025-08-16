/*
 * @lc app=leetcode id=79 lang=java
 *
 * [79] Word Search
 */

// @lc code=start
class Solution {
    public boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==word.charAt(0)){
                    if(solve(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean solve(char board[][],String word,int row,int col,int index){
        if(index==word.length()){
            return true;
        }
        if(row<0 || row>=board.length ||col<0||col>=board[0].length||board[row][col]!=word.charAt(index)){
            return false;
        }
        char temp=board[row][col];
        board[row][col]='#';
        int[][]directions={{-1,0},{1,0},{0,-1},{0,1}};
        for(int dir[]:directions){
            int newrow=row+dir[0];
            int newcol=col+dir[1];
            if(solve(board,word,newrow,newcol,index+1)){
                return true;
            }
        }
        board[row][col]=temp;
        return false;
    }
}
// @lc code=end

