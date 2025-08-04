/*
 * @lc app=leetcode id=128 lang=java
 *
 * [128] Longest Consecutive Sequence
 */

// @lc code=start
class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int longest=1;
        for(int i=1;i<nums.length;i++){
           
            if(nums[i]==nums[i-1]+1){
                curmax++;
                longest=Math.max(curmax,longest);
            }
            else{
                curmax=1;
            }
        }
        return longest;
        
    }
}
// @lc code=end

