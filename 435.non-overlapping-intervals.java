/*
 * @lc app=leetcode id=435 lang=java
 *
 * [435] Non-overlapping Intervals
 */
// @lc code=start
class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int count=0;
        if (intervals.length == 0) return 0;
        int n=intervals.length;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int prevend=intervals[0][1];
        for(int i=1;i<n;i++){
            if(intervals[i][0]<prevend){
                count++;
            }
            else{
                prevend=intervals[i][1];
            }
        }
        return count;
    }
}
// @lc code=end

