//Delete Kth Node From End

/****************************************************************

 Following is the class structure of the Node class:

 class Node {
     public int data;
     public Node next;
     public Node prev;

     Node()
     {
         this.data = 0;
         this.next = null;
         this.prev = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
         this.prev = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
         this.prev = next;
     }
 };

 *****************************************************************/

public class Solution {
    public static Node removeKthNode(Node head, int K) {
        // Check if the linked list is empty.
        if (head == null) {
            return null;
        }

        int n = 0;        // Initialize a variable to count the number of nodes.
        Node curr = head; // Initialize a current pointer to traverse the list.

        // Traverse the linked list to count the number of nodes.
        while (curr != null) {
            n++;
            curr = curr.next;
        }

        int index = n - K; // Calculate the index of the Kth node from the end.
        
        // If the Kth node is the head node, remove it by updating the head.
        if (index == 0) {
            head = head.next;
            return head;
        }

        Node prev = null; // Initialize a pointer to the node before the Kth node.
        curr = head;     // Reset the current pointer to the head.

        // Traverse the list to find the node before the Kth node.
        for (int i = 0; i < index; i++) {
            prev = curr;
            curr = curr.next;
        }

        // Remove the Kth node by updating the 'next' reference of the previous node.
        prev.next = curr.next;

        return head; // Return the head of the modified linked list.
    }
}
