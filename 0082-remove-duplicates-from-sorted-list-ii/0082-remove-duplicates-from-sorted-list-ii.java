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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(-500);
        temp.next=head;
        ListNode prev=temp;
        ListNode slow=temp;
        ListNode fast=head;
        
        while(fast!=null){
            if(slow.val==fast.val){
                while(fast!=null && fast.val==slow.val){
                    fast=fast.next;
                }
                slow=prev;
                slow.next=fast;
            }
            prev=slow;
            slow=slow.next;
            if(fast!=null){
                fast=fast.next;
            }
        }
        return temp.next;
    }
}