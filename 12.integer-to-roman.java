/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution {
    public String intToRoman(int num) {
        Map<Integer,String> m=new HashMap<>();
        m.put(1000,"M");
        m.put(500,"M");
        m.put(100,"M");
        m.put(50,"");
        m.put(10,"X");
        m.put(5,"V");
        m.put(1,"I");

        
    }
}
// @lc code=end

