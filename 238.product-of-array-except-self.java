/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        left[0]=1;
        right[nums.length-1]=1;
        for(int i=0;i<nums.length;i++){
            if(left[i]==0){
                left[i]=1;
            }
            left[i]=left[i]*nums[i];
        }

        for(int i=nums.length-1;i>=0;i--){

        }
        
    }
}
// @lc code=end

