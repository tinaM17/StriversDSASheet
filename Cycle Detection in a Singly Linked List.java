//Cycle Detection in a Singly Linked List


/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
    
     Node()
     {
         this.data = 0;
         this.next = null;
     }
    
     Node(int data)
     {
         this.data = data;
         this.next = null;
     }
    
     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 }

 *****************************************************************/

public class Solution {

    // Function to detect a cycle in a linked list.
    public static boolean detectCycle(Node head) {
        
        // Check if the linked list is empty or has only one node (no cycle can exist).
        if (head == null || head.next == null)
            return false;
        
        // Initialize two pointers, fast and slow, both initially pointing to the head.
        Node fast = head;
        Node slow = head;

        // Traverse the linked list with two pointers.
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next; // Move the fast pointer two steps ahead.
            slow = slow.next;      // Move the slow pointer one step ahead.

            // If the fast pointer meets the slow pointer, a cycle exists.
            if (fast == slow) {
                return true;
            }
        }
        
        // If the loop completes without meeting, there is no cycle.
        return false;
    }
}
