/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution {
    public int[] countBits(int n) {
        int res[]=new int[n+1];
        for(int i=0;i<=n;i++){
            res[i]=Integer.bitCount(i);
        }
        return res;
        
    }
}
// @lc code=end

