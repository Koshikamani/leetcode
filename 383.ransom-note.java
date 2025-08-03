/*
 * @lc app=leetcode id=383 lang=java
 *
 * [383] Ransom Note
 */

// @lc code=start
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int freq[]=new int[26];
        Arrays.fill(freq,0);
        for(int i=0;i<magazine.length();i++){
            freq[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(freq[ransomNote.charAt(i)-'a']==0){
                return false;
            }
            freq[ransomNote.charAt(i)-'a']--;
            
        }
        return true;

        
    }
}
// @lc code=end

