/*
 * @lc app=leetcode id=1456 lang=java
 *
 * [1456] Maximum Number of Vowels in a Substring of Given Length
 */

// @lc code=start
class Solution {
    public int maxVowels(String s, int k) {
    //     int l=0;int r=k-1;
         int n=s.length();
    //     int vowel=0;
    //     while(r<n){
    //         int f=findvowelc(l,r,s);
    //         vowel=Math.max(vowel,f);
    //         l++;r++;

    //     }
    //     return vowel;
    // optimal
        int max;
        int vowel=0;
        for(int i=0;i<k;i++){//main first add k elemnts 
            if(isvowel(s.charAt(i))){
                vowel++;//count occurances or sum 
            }
        }
        max=vowel;//assign to max 
        for(int i=k;i<n;i++){
            if(isvowel(s.charAt(i))){//then add new elemnt to window 
                vowel++;
            }
            if(isvowel(s.charAt(i-k))){//remove elemnt fromwindow from first index
                vowel--;
            }
            max=Math.max(max,vowel);//find max

        }
        return max;

    }
    public boolean isvowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }

        return false;
    }
}
// @lc code=end

