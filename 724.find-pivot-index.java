/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
class Solution {
    public int pivotIndex(int[] nums) {
        int sl[]=new int[nums.length];
        int sr[]=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            
            sum+=nums[i];
            sl[i]=sum;
        }
        int s=0;
        for(int i=nums.length-1;i>=0;i--){
            
            s+=nums[i];
            sr[i]=s;
        }
        for(int i=0;i<nums.length;i++){
            if(sl[i]==sr[i]){
                return i;
            }
        }
        return -1;
        
    }
}
// @lc code=end

