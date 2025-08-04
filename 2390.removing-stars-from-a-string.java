/*
 * @lc app=leetcode id=2390 lang=java
 *
 * [2390] Removing Stars From a String
 */

// @lc code=start

class Solution {
    public String removeStars(String s) {
       StringBuilder f=new StringBuilder();
       for(char ch:s.toCharArray()){
        if(ch=='*'){
            f.deleteCharAt(f.length()-1);
        }
        else {
            f.append(ch);
        }
       }
       return f.toString().isEmpty()?"":f.toString();
        
    }
}
// @lc code=end

