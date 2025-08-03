/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sc=new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sb.append(Charatcter.toLowerCase(s.charAt(i));
            }
        }
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isLetterOrDigit(s.charAt(i))){
                sc.append(Character.toLowerCase(s.charAt(i)));
            }
        }  
        return sc.toString().equals(sb.toString()) ;
    }
}
// @lc code=end

