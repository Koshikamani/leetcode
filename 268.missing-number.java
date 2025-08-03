/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        // Arrays.sort(nums);
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     if(nums[i]!=i){
        //         return i;
        //     }
        // }
        // return n;
        int n=nums.length;
        int s1=n*(n+1)/2;//natural nums formula
        int s2=0;
        for(int i:nums){
            s2+=i;
        }
        return s1-s2;
        
    }
}
// @lc code=end

