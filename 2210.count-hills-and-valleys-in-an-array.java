/*
 * @lc app=leetcode id=2210 lang=java
 *
 * [2210] Count Hills and Valleys in an Array
 */

// @lc code=start
class Solution {
    public int countHillValley(int[] nums) {
        ArrayList<Integer> l= new ArrayList<>();
        l.add(nums[0]);
        for(int i = 1; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                l.add(nums[i]);
            }
        }
        int c=0;
        int n=l.size();
        for(int i=1;i<n-1;i++){
            int prev=l.get(i-1);
            int cur=l.get(i);
            int next=l.get(i+1);
            if(prev<cur&& cur>next){
                c++;
            }
            else if(prev>cur&& cur<next){
                c++;
            }
        }
        return c;
        
    }
}
// @lc code=end

