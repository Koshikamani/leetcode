/*
 * @lc app=leetcode id=139 lang=java
 *
 * [139] Word Break
 */

// @lc code=start
class Solution {
    private Boolean[] t;
    int n;
    public boolean wordBreak(String s, List<String> wordDict) {
            n=s.length();
            t=new Boolean[s.length()];
            return solve(s,0,wordDict);
    }
    private boolean solve(String s,int idx,List<String> wordDict){
        if(idx==n){
            return true;
        }
        if(t[idx]!=null){
            return t[idx];
        }
        for(int endidx=idx+1;endidx<=n;endidx++){
            String split=s.substring(idx,endidx);
            if(wordDict.contains(split))
        }
    }
}
// @lc code=end

