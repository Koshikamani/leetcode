/*
 * @lc app=leetcode id=451 lang=java
 *
 * [451] Sort Characters By Frequency
 */

// @lc code=start

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(m.contains(s.charAt(i))){
                m.put(s.charAt(i),m.getOrDefault(s.charAt(i)+1,0));

            }
            m.put(s.charAt(i),1 );
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(m.entrySet());
        StringBuilder d=new StringBuilder();
        while(!pq.isEmpty()){
            Map<Character,Integer> h=pq.poll();
            int f=h.getValue();
            char o=h.getKey();
            for(int i=0;i<f;i++){
                d.append(o);
            }

        }
        return d.toString();
            
        }

        
}

// @lc code=end

