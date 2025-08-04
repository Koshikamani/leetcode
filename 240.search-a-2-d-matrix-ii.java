/*
 * @lc app=leetcode id=240 lang=java
 *
 * [240] Search a 2D Matrix II
 */

// @lc code=start
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // return bs(matrix,target);
        //optimal
        int m = matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n - 1;

        while (row < m && col >= 0) {
            if (matrix[row][col] == target) {
                return true;
            } else if (matrix[row][col] > target) {
                col--; // move left
            } else {
                row++; // move down
            }
        }

        return false;
        
    }

    // private boolean bs(int[][] matrix,int target){
    //     for(int i=0;i<matrix.length;i++){
    //         int low=0;int high=matrix[i].length-1;//no of columns since we are searching in row wise
    //         while(low<=high){
    //             int mid=low+(high-low)/2;
    //             if(matrix[i][mid]==target){
    //                 return true;

    //             }
    //             else if(matrix[i][mid]<target){
    //                 low=mid+1;
    //             }
    //             else{
    //                 high=mid-1;
    //             }
    //         }

    //     }
    //     return false;
        
    // }
}
// @lc code=end

