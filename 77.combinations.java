/*
 * @lc app=leetcode id=77 lang=java
 *
 * [77] Combinations
 */

// @lc code=start
class Solution {
     List<List<Integer>> res;
    public List<List<Integer>> combine(int n, int k) {
        res=new ArrayList<>();
        List<Integer> l=new ArrayList<>();
        solve(1,n,k,l);
        return res;
    }

    public void solve(int start,int n,int k,List<Integer> l){
        if(k==0){
            res.add(new ArrayList<>(l));
            return;
        }
        if(start>n){
            return;
        }
        l.add(start);
        solve(start+1,n,k-1,l);
        l.remove(l.size()-1);
        solve(start+1,n,k,l);
}
}
// @lc code=end

