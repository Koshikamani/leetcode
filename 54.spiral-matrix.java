/*
 * @lc app=leetcode id=54 lang=java
 *
 * [54] Spiral Matrix
 */

// @lc code=start

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,right=matrix[0].length-1;
        int bottom=matrix.length-1;int left=0;
        List<Integer> l=new ArrayList<>();
        while(left<=right && top<=bottom){
            for(int i=left;i<=right;i++){
                l.add(matrix[top][i]);

            }
            top++;
            for(int i=top;i<=bottom;i++){
                l.add(matrix[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    l.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    l.add(matrix[i][left]);
                }
                left++;
            }
            
            
        }
        return l;
        
    }
}
// @lc code=end

