/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
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
   public ListNode removeNthFromEnd(ListNode head, int n) {
        // if(head==null||head.next==null){
        //     return null;
        // }
        // int length=len(head);
        // if(n==length){
        //     return  head.next;
        // }

        // int del=length-n;
        // ListNode temp=head;
        // for(int i=0;i<del-1;i++){
        //     temp=temp.next;
        // }
        // temp.next=temp.next.next;
        // return head;
        ListNode fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            return head.next;
        }
        ListNode slow=head;
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
 
        slow.next=slow.next.next;
        return head;
    }
    // public int len(ListNode head){
    //     int c=0;
    //     ListNode temp=head;
    //     while(temp!=null){
    //         c++;
    //         temp=temp.next;
    //     }
    //     return c;
    // }
}
// @lc code=end

