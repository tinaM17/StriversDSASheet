/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        
        ListNode meet=isCyclePresent(head);
        if(meet==null) return null;
        ListNode start=head;
        
        while(start!=meet){
            start=start.next;
            meet=meet.next;
        }
        return start;
//         Set<ListNode> set=new HashSet<>();
        
//         ListNode prev=null;
//         ListNode curr=head;
        
//         while(curr!=null){
//             if(set.contains(curr)){
//                 return curr;
//             }
//             set.add(curr);
//             prev=curr;
//             curr=curr.next;
//         }
//         return null;
    }
    
    public ListNode isCyclePresent(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast)
                return slow;
        }
        return null;
    }
}