/*
 * @lc app=leetcode id=1781 lang=java
 *
 * [1781] Sum of Beauty of All Substrings
 */

// @lc code=start
class Solution {
    public int beautySum(String s) {
         int beauty=0;
        for(int i=0;i<s.length();i++){
            int freq[]=new int[26];
            for(int j=i;j<s.length();j++){
                freq[s.charAt(j)-'a']++;
                int maxfreq=0;int minfreq=Integer.MAX_VALUE;
                for(int k=0;k<26;k++){
                    if(freq[k]==0){
                        continue;
                    }
                    maxfreq=Math.max(maxfreq,freq[k]);
                    minfreq=Math.min(minfreq,freq[k]);
                }
                 beauty+=(maxfreq-minfreq);
            }
           
        }   
        return beauty; 
        
    }
}
// @lc code=end

