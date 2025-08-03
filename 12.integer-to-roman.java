/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

class Solution {
    public String intToRoman(int num) {
        String r="";
        TreeMap<Integer, String> m = new TreeMap<>(Collections.reverseOrder());
        m.put(1000,"M");
        m.put(900,"CM");
        m.put(500,"D");
        m.put(400,"CD");
        m.put(100,"C");
        m.put(90,"XC");
        m.put(50,"L");
        m.put(40,"XL");
        m.put(10,"X");
        m.put(9,"IX");
        m.put(5,"V");
        m.put(4,"IV");
        m.put(1,"I");
        for(Entry<Integer, String> e:m.entrySet()){
            while(num>=e.getKey()){
                r+=e.getValue();
                num-=e.getKey();
            }


        }
        return r;
        
    }
}
// @lc code=end

