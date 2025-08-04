/*
 * @lc app=leetcode id=162 lang=java
 *
 * [162] Find Peak Element
 */

// @lc code=start
class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        while(low<high){
            int mid=low+(high-low)/2;
            if(nums[mid]>nums[mid+1]){
                high=mid;//
            }
            else{
                low=mid+1;
            }
        }
        return low; 
    }
}

/*🧠 Logic Behind Binary Search Decision:

    If nums[mid] > nums[mid + 1]: peak is left, possibly at mid.

    If nums[mid] < nums[mid + 1]: peak is right, definitely after mid.

This works because:

    If you're in an increasing slope, peak lies to the right.

    If you're in a decreasing slope, peak lies to the left or is the mid itself. */
// @lc code=end

