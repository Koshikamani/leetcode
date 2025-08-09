/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution {
    public String addStrings(String num1, String num2) {

        StringBuilder s=new StringBuilder();
        int carry=0;
        int i=num1.length()-1;
        int j=num2.length()-1;
        while(i>=0 && j>=0){
            int sum;
            int x=num1.charAt(i)-'0';
            int y=num2.charAt(j)-'0';
            sum=x+y+carry;
            carry=sum/10;
            s.append(sum%10);
            
            i--;j--;
        }
        while(i>=0){//leftover numbers from num1& also carry from prevu=ious numbers
            int sum=(num1.charAt(i)-'0')+carry;
            carry=sum/10;
            s.append(sum%10);
            i--;
        }
        while(j>=0){//leftover numbers from num2 and also carry from previous numbers sum
            int sum=(num2.charAt(j)-'0')+carry;
            carry=sum/10;
            s.append(sum%10);
            j--;
        }
        if(carry>0){
            s.append(carry);
        }
        return s.reverse().toString();
    }
}
// @lc code=end

