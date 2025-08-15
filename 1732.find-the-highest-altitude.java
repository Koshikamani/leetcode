/*
 * @lc app=leetcode id=1732 lang=java
 *
 * [1732] Find the Highest Altitude
 */

// @lc code=start
class Solution {
    public int largestAltitude(int[] gain) {
       int sum=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<gain.length;i++){
            sum+=gain[i];
            max=Math.max(max,sum);
       } 
       return max>0?max:0;
    }
}
// @lc code=end

