/*
 * @lc app=leetcode id=3375 lang=java
 *
 * [3375] Minimum Operations to Make Array Values Equal to K
 */

// @lc code=start
class Solution {
    public int minOperations(int[] nums, int k) {
        int n=nums.length;
        Set<Integer> s=new HashSet<>();
        for(int num:nums){
            if(num<k){
                return -1;
            }
        }
        for(int num:nums){
            if(num>k){
                s.add(num);
            }
        }
        return s.size();

        /*we only consider greater than k values to make it k using minimun ops
         * 
         * Select an integer h that is valid for the current values in nums.
            For each index i where nums[i] > h, set nums[i] to h.

            if we found number less than k return -1 
            if we found number greater than k add to set


            return set size since we only make that elemnts to k


            nums = [5, 4, 5], k = 4
             Operation:
            - Choose h = 4 → all > 4 become 4 → [4, 4, 4]
            

            nums = [5, 2, 5, 4, 5]
            k = 2

            Now:

                nums[1] = 2 → okay

                But what if we had: nums[1] = 1 → this is less than k = 2

            Can we ever make 1 become 2?
            No, we can't increase.

            So, if you see any number < k, it breaks the possibility of making all numbers equal to k.


         */
    }
}
// @lc code=end

