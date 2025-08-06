class Solution {
   
    public int myAtoi(String s) {
        if(s==null||s.isEmpty()){
            return 0;
        }
        // code here
        s=s.trim();
         int i=0;
         int n=s.length();
         if(i==n){
             return 0;
         }
        int sign=1;
        if(s.charAt(i)=='+'||s.charAt(i)=='-'){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
       
        int res=0;
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=s.charAt(i)-'0';
            if(res>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            res=res*10+digit;
            i++;
        }
        return sign*res;
    }
}
