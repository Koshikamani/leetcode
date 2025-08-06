/*
 * @lc app=leetcode id=67 lang=java
 *
 * [67] Add Binary
 */

// @lc code=start
class Solution {
    public String addBinary(String a, String b) {
            int i=a.length()-1;
    int j=b.length()-1;
    
   
    int carry=0;
    StringBuilder sb=new StringBuilder();
    while(i>=0 ||j>=0||carry==1){
         int sum=carry;
        if(i>=0){
            sum+=a.charAt(i)-'0';
            i--;
        }
        if(j>=0){
            sum+=b.charAt(j)-'0';
            j--;
        }
       sb.append(sum%2);//gives digit after adding 0or 1;
        carry=sum/2;//gives carry eg 2/2=1 or 3/2=1;
        
    }
    String res= sb.reverse().toString();
    int firstone=res.indexOf('1');
    if(res.indexOf('1')==-1){
        return "0";
    }
    return res.substring(firstone);
        
    }
}
// @lc code=end

