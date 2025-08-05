/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        // for(int i=0;i<n;i++){
        //     int[] hash=new int[256];
        //     Arrays.fill(hash,0);
        //     int len=0;
        //     for(int j=i;j<n;j++){
        //         if(hash[s.charAt(j)]==1){
        //             break;  
        //         }
        //         hash[s.charAt(j)]=1;
        //         len++;

        //     }
        //     maxlen=Math.max(len,maxlen);
        // }   
        // return maxlen;     
        

        //optimal slideing window+hashMap


        int l=0,r=0;
        int hash[]=new int[256];
        Arrays.fill(hash,-1);
        while(r<n){
            if(hash[s.charAt(r)]!=-1){
                if(hash[s.charAt(r)]>=l){
                    l=hash[s.charAt(r)]+1;

                }
            }
            int len=r-l+1;
            maxlen=Math.max(len,maxlen);
            hash[s.charAt(r)]=r;
            r++;

        }
        return maxlen;
        
    }
}
// @lc code=end

