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
        int count=0;
        ListNode temp=new ListNode(0);
        temp.next=head;
        ListNode curr=head;
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        curr=head;
        ListNode prev=temp;
        int num=count-n;
        while(num>0){
            prev=curr;
            curr=curr.next;
            num--;
        }
        prev.next=curr.next;
        return temp.next;
    }
}