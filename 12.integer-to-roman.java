/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public String intToRoman(int num) {
        HashMap<Integer,String> m=new HashMap<>();
        m.put(1000,"M");
        m.put(500,"D");
        m.put(100,"C");
        m.put(50,"L");
        m.put(10,"X");
        m.put(5,"V");
        m.put(1,"I");
        for(Map.Entry<Integer,String> e:m.entrySet()){

        }

        

        
    }
}
// @lc code=end

