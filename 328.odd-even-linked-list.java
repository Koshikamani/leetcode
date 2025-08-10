/*
 * @lc app=leetcode id=328 lang=java
 *
 * [328] Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        //naive 
        // ArrayList<Integer> l=new ArrayList<>();
        // ListNode temp=head;
        // if(head==null||head.next==null){
        //     return head;
        // }
        // while(temp!=null && temp.next!=null){
        //     l.add(temp.val);
        //     temp=temp.next.next;
        // }
        // if(temp!=null){
        //     l.add(temp.val);
        // }
        // temp=head.next;
        //  while(temp!=null && temp.next!=null){
        //     l.add(temp.val);
        //     temp=temp.next.next;
        // }
        // if(temp!=null){
        //     l.add(temp.val);
        // }
        // temp=head;
        // for(int i=0;i<l.size();i++){
        //     temp.val=l.get(i);
        //     temp=temp.next;
        // }
        // return head;

        //optimal


      
        if(head==null||head.next==null){
            return head;
        }
           ListNode odd=head;
        ListNode even=head.next;
          ListNode evenhead=head.next;

        while(even!=null&&even.next!=null){
            odd.next=odd.next.next;
            even.next=even.next.next;

            odd=odd.next;
            even=even.next;
        }
        odd.next=evenhead;
        return head;
        
        
    }
}
// @lc code=end

