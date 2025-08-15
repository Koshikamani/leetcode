/*
 * @lc app=leetcode id=643 lang=java
 *
 * [643] Maximum Average Subarray I
 */

// @lc code=start
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int max=Integer.MIN_VALUE;
        // int l=0;int r=k-1;
        // while(r<n){
        //     int sum=0;
        //     for(int i=l;i<=r;i++){
        //         sum+=nums[i];
        //     }
        //     max=Math.max(max,sum);
        //     l++;r++;
        // }

        //optimization 
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=nums[i];
        }
        max=sum;
        for(int i=k;i<n;i++){
            sum+=nums[i]-nums[i-k];//as we add new element into window we remove first elemnt from window eg:if we add nums[4] then we remove num[4-4]=nums[0] to maintain window size
            max=Math.max(max,sum);
        }
        return (double)max/k;
    }
}
// @lc code=end

