/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
 */

// @lc code=start

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
        PriorityQueue<ListNode> pq=new PriorityQueue<>(Comparator.comparingInt(n->n.val));
        for(ListNode h:lists){
            if(h!=null){
                pq.add(h);
            }
        }

        while(!pq.isEmpty()){
            ListNode temp=pq.poll();
            cur.next=temp;
            cur=cur.next;
            if(temp.next!=null){
                pq.add(temp.next);
                temp=temp.next;
            }
        }
        return dummy.next;
          /*   List 1: 1 -> 4 -> 7

                List 2: 2 -> 5 -> 8

                List 3: 3 -> 6 -> 9

            Output logs:

            Added initial node to PQ: 1
            Added initial node to PQ: 2
            Added initial node to PQ: 3
            Polled node from PQ: 1
            Added next node to PQ: 4
            Polled node from PQ: 2
            Added next node to PQ: 5
            Polled node from PQ: 3
            Added next node to PQ: 6
            Polled node from PQ: 4
            Added next node to PQ: 7
            Polled node from PQ: 5
            Added next node to PQ: 8
            Polled node from PQ: 6
            Added next node to PQ: 9
            Polled node from PQ: 7
            Polled node from PQ: 8
            Polled node from PQ: 9*/
    }
}
// @lc code=end

