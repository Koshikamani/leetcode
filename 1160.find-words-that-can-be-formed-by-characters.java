/*
 * @lc app=leetcode id=1160 lang=java
 *
 * [1160] Find Words That Can Be Formed by Characters
 */

// @lc code=start
class Solution {
    public int countCharacters(String[] words, String chars) {
         int freq[]=new int[26];
        int len=0;
        for(int i=0;i<chars.length();i++){
            freq[chars.charAt(i)-'a']++;
        }
        for(String word:words){
            String h=word;
            int temp[]=freq.clone();
            boolean canform=true;
            for(int i=0;i<word.length();i++){
                //temp[h.charAt(i)-'a']--;
                if(--temp[h.charAt(i)-'a']<0){//decrement first and check condition same as above commented code
                    canform=false;
                    break;
                }

            }
            if(canform){
                len+=word.length();
            }
        }
        return len;
        
    }
}
// @lc code=end

