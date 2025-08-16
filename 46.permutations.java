/*
 * @lc app=leetcode id=46 lang=java
 *
 * [46] Permutations
 */

// @lc code=start
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        solve(0,nums,new ArrayList<>(),res);
        return res;
        
    }
    public void solve(int start,int nums[],List<Integer> l,List<List<Integer>> res){
        if(start==nums.length){
            res.add(new ArrayList<>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!l.contains(nums[i])){
                l.add(nums[i]);
                solve(start+1,nums,l,res);
                l.remove(l.size()-1);
            }
        }
    }
}
// @lc code=end

