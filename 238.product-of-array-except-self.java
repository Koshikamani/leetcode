/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left=1;
        int right=1;
        for(int i=0;i<nums.length;i++){
            if(left==0){
                left=1;
            }
            left=left*nums[i];
        }

        for(i)
        
    }
}
// @lc code=end

