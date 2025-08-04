/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution {
    public int[][] merge(int[][] intervals) {
         Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        List<List<Integer>> l=new ArrayList<>();
        int n=intervals.length;

        for(int i=0;i<n;i++){
            if(l.isEmpty()||intervals[i][0]>l.get(l.size()-1).get(1)){//get last list last elemnt and compare it to arr next list first elemnt 
                l.add(Arrays.asList(intervals[i][0],intervals[i][1]));
            }
            else{
                l.get(l.size()-1).set(1,Math.max(l.get(l.size()-1).get(1),intervals[i][1]));
            }

        }
        int res[][]=new int[l.size()][2];
        for(int i=0;i<l.size();i++){
            res[i][0]=l.get(i).get(0);
            res[i][1]=l.get(i).get(1);
        }

        return res;  
    }
}
// @lc code=end

