/*
 * @lc app=leetcode id=20 lang=java
 *
 * [20] Valid Parentheses
 */

// @lc code=start
class Solution {
    public boolean isValid(String s) {
        while(true){
        if(s.contains("()")){
            s=s.replace("()", "");
        }
        else if(s.contains("{}")){
            s=s.replace("{}", "");

        }
        else if(s.contains("[]")){
            s=s.replace("[]", "");
        }
        if(s.isEmpty()){
            return true;
        }
    }
    return fals
        
    }
}
// @lc code=end

