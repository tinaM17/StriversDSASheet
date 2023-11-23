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
        //Using two pointer approach
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode first=head;
        
        while(n>0){
            first=first.next;
            n--;
        }
        
        ListNode second=temp;
        while(first!=null){
            first=first.next;
            second=second.next;
        }
        second.next=second.next.next;
        return temp.next;
        
        // int count=0;
        // ListNode temp=new ListNode(0);
        // temp.next=head;
        // ListNode curr=head;
        // while(curr!=null){
        //     count++;
        //     curr=curr.next;
        // }
        // curr=head;
        // ListNode prev=temp;
        // int num=count-n;
        // while(num>0){
        //     prev=curr;
        //     curr=curr.next;
        //     num--;
        // }
        // prev.next=curr.next;
        // return temp.next;
    }
}