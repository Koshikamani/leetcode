/*
 * @lc app=leetcode id=57 lang=java
 *
 * [57] Insert Interval
 */

// @lc code=start
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
         List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        list.add(newInterval);
        list.sort((a, b) -> a[0] - b[0]);
        List<List<Integer>> l=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            int start = list.get(i)[0];
            int end = list.get(i)[1];
            if(l.isEmpty()||l.get(l.size()-1).get(1)<start){
                    l.add(Arrays.asList(start,end));
            }
            else{
                l.get(l.size()-1).set(1,Math.max(l.get(l.size()-1).get(1),end));
            }

        }
        int arr[][]=new int[l.size()][2];
        for(int i=0;i<l.size();i++){
                
            arr[i][0]=l.get(i).get(0);
            arr[i][1]=l.get(i).get(1);

        }
        return arr;
        
    }
}
// @lc code=end

