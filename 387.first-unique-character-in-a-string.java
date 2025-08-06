/*
 * @lc app=leetcode id=387 lang=java
 *
 * [387] First Unique Character in a String
 */

// @lc code=start
class Solution {
    public int firstUniqChar(String s) {
         Map<Character,Integer> m=new HashMap();
        for(char ch:s.toCharArray()){
            m.put(ch,m.getOrDefault(ch,0)+1);
        }
        for(char ch:s.toCharArray()){
            if(m.get(ch)==1){
                return ;
            }
        }
        return '$';
        
    }
}
// @lc code=end

