//Segregate Even And Odd Nodes In a Linked List


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
    public static Node segregateEvenOdd(Node head) {
        // Initialize four pointers for even and odd start and end nodes.
        Node evenStart = null;
        Node evenEnd = null;
        Node oddStart = null;
        Node oddEnd = null;
        Node curr = head; // Initialize a current pointer to traverse the list.

        // Traverse the linked list.
        while (curr != null) {
            // Check if the current node's data is even.
            if (curr.data % 2 == 0) {
                // If even, update the even start and end pointers.
                if (evenStart == null) {
                    evenStart = curr;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = curr;
                    evenEnd = evenEnd.next;
                }
            } else {
                // If odd, update the odd start and end pointers.
                if (oddStart == null) {
                    oddStart = curr;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = curr;
                    oddEnd = oddEnd.next;
                }
            }
            curr = curr.next;
        }

        // Check if there are no even or odd nodes.
        if (evenStart == null || oddStart == null) {
            return head;
        }

        // Combine the even and odd lists and update the end of the odd list.
        evenEnd.next = oddStart;
        oddEnd.next = null;

        // Update the head of the linked list to be the start of the even list.
        head = evenStart;

        return head; // Return the head of the modified linked list.
    }
}
