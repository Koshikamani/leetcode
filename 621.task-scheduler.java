/*
 * @lc app=leetcode id=621 lang=java
 *
 * [621] Task Scheduler
 */

// @lc code=start
class Solution {
    public int leastInterval(char[] tasks, int n) {
        int freq[]=new int[26];
        for(char ch:tasks){
            freq[ch-'A']++;
        }//count frequency of all characters 
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());//place max frequency elements on priority
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                pq.add(freq[i]);
            }
        }//add all freq>0 elements pq will sort itself 

        int time=0;//task total time 
        while(!pq.isEmpty()){//until priority queue is  not empty 
            ArrayList<Integer> l=new ArrayList<>();//take an arraylist for storing frequency of elemts after they are polled and used and add them to priority Q from this 
            int task=0;//counts no of tasks for each cycle 
            int cycle=n+1;//divided into chunks of slots as a character appeared once reappear after n slots

            while(cycle-->0 &&!pq.isEmpty()){//until cycle not finished and pq is not emoty 
                int cur=pq.poll();//poll most frequent elemnt or top elemnt
                if(cur>1){//if it is greater than 1 then add to list by subtravting 1 from at as we use it 
                    l.add(cur-1);//add to list for next cycle of frequent elemnts
                }
                task++;//tasks is incremented as we assign cpu
            }
            for(int i:l){
                pq.add(i);//after cycle completion add frequency left elemnts to priority q from list 
            }

            time+=(pq.isEmpty())?task:n+1;//if priority q is empty and cycle is not completed  add no of tasks assigned in that cycle to time ,else tasks are completey filled in that cycle then add n+1
        }
        return time;
        
    }
}
// @lc code=end

