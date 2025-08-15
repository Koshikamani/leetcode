/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int i=0,j=height.length-1;
        int container=0;
         while(i<j){
            int a=j-i;//measure distance between them
            int x=Math.min(height[i],height[j]);//obtain min height as water is filled only upto minheight else it overflow
            int y=a*x;//calculate how much water it can hold using distance between poles and minimum pole height
            container=Math.max(container,y);//if current water holding is greater than maximum them store it in max 
            if(height[i]<height[j]){//Moving the shorter pole might help — it could find a taller height while sacrificing some width.
                i++;
            }
            else{//Moving the taller pole inward cannot increase the area because the limiting height will not improve, but the width decreases.
                j--;
            }
         }  
         return container;
    }
}
// @lc code=end

