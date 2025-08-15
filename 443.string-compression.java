/*
 * @lc app=leetcode id=443 lang=java
 *
 * [443] String Compression
 */

// @lc code=start
class Solution {
    public int compress(char[] chars) {
        int index=0;//to store compressed length
        int i=0;
        while(i<chars.length){//loop till length
            char curr=chars[i];//take curr variable to store curent char upto upcoming diferent char
            int count=0;//stores count of curent char
            while(i<chars.length && chars[i]==curr){//loop upto length and till current characetr is equal to characetr in array
                i++;//increment iteration
                count++;//count the current value occurance
            }
            chars[index++]=curr;//after cur character streak ends stoe it in chars array and increment index
            if(count>1){//if count is greater than 1
                String cString=String.valueOf(count);//convert count to string 
                for(char c:cString.toCharArray()){//make it to char array
                    chars[index++]=c;//store each digit  in chars array
                }
            }
        }
        return index;
    }
}
// @lc code=end

