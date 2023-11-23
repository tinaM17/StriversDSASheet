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
    public ListNode middleNode(ListNode head) {
        int count=0;
        ListNode curr=head;
        
        while(curr!=null){
            count++;
            curr=curr.next;
        }
        
        int num=0;
        curr=head;
        while(num<count/2){
            num++;
            curr=curr.next;
        }
        return curr;
    }
}