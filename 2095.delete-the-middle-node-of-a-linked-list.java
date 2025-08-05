/*
 * @lc app=leetcode id=2095 lang=java
 *
 * [2095] Delete the Middle Node of a Linked List
 */

// @lc code=start
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
     public ListNode deleteMiddle(ListNode head) {
       
        int i=0;
        ListNode temp=head;
         int len=length(head);
         ListNode prev=temp;
         if(head==null||head.next==null){
            return null;
         }
         if(len<=2){
            temp.next=null;
            return head;
         }
        while(i<len/2-1&& temp.next!=null){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;

        
    }
    public int length(ListNode head){
        ListNode temp=head;
        int count=0;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
}
// @lc code=end

