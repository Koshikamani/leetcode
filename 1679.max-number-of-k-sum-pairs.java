/*
 * @lc app=leetcode id=1679 lang=java
 *
 * [1679] Max Number of K-Sum Pairs
 */

// @lc code=start
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int i=0;int j=nums.length-1;
        int count=0;
        while(i<j){
            int sum=nums[i]+nums[j];
            if(sum==k){
                count++;
                i++;j--;//if we get sum we need to move both pointers 
            }
            else if(sum>k){
                j--;
            }
            else{
                i++;
            }
            
        }
        return count;
    }
}
// @lc code=end

