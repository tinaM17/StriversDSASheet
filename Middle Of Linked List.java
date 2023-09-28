//Middle Of Linked List

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
    public static Node findMiddle(Node head) {
        // Check if the linked list is empty or has only one node.
        if (head == null || head.next == null) {
            return head;
        }
        
        // Initialize two pointers, fast and slow, both initially pointing to the head.
        Node fast = head;
        Node slow = head;

        // Traverse the linked list with two pointers.
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next; // Move the fast pointer two steps ahead.
            slow = slow.next;      // Move the slow pointer one step ahead.
        }
        
        // Count the total number of nodes in the linked list.
        int n = 0;
        Node curr = head;
        while (curr != null) {
            n++;
            curr = curr.next;
        }
        
        // Return the middle node based on whether the total number of nodes is even or odd.
        return (n % 2 == 0) ? slow.next : slow;
    }
}
