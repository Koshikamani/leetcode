/*
 * @lc app=leetcode id=846 lang=java
 *
 * [846] Hand of Straights
 */

// @lc code=start
class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        // if((hand.length)%(groupSize)!=0){
        //     return false;
        // }
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int num:hand){
            pq.add(num);
        }
        while(!pq.isEmpty()){
            int first=pq.peek();
            for(int i=0;i<groupSize;i++){
                int need=first+i;
                if(!pq.remove(need)){//if the number we need(consecutive number) is not there in pq then return false
                    return false;
                }
            }
        }
        return true;



    }
}
// @lc code=end

