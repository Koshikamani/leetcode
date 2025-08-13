/*
 * @lc app=leetcode id=2264 lang=java
 *
 * [2264] Largest 3-Same-Digit Number in String
 */

// @lc code=start
class Solution {
    public String largestGoodInteger(String num) {
        String[] nums=new String[]{"999","888","777","666","555","444","333","222","111","000"};
        String  r="";
        for(int i=0;i<10;i++){
            if(num.contains(nums[i])){
                r+=nums[i];
                break;
            }
        }
        return r;
        
    }
}
// @lc code=end

