/*
 * @lc app=leetcode id=392 lang=java
 *
 * [392] Is Subsequence
 */

// @lc code=start
class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals("")){
            return true;
        }
        // for(int i=0;i<t.length();i++){
        //     if(s.charAt(ind)==t.charAt(i) && ind<s.length()){
        //         r+=s.charAt(ind);
        //         if(r.equals(s)){
        //             break;
        //         }
        //         ind++;
        //     }
        // }
        // return r.equals(s);

        //twopinter 

        int i=0,j=0;
        while(i<s.length() && j<t.length()){
             if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
            
        }
        return i==s.length();
    }
}
// @lc code=end

