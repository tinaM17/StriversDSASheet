//Intersection of Two Linked Lists

import java.util.HashSet;


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
    public static int findIntersection(Node firstHead, Node secondHead) {
        if (firstHead == null || secondHead == null)
            return -1; // Return -1 if either of the lists is empty.

        // Approach using a HashSet to store nodes from the first list.
        HashSet<Node> set = new HashSet<>();
        Node curr = firstHead;

        // Traverse the first linked list and add its nodes to the HashSet.
        while (curr != null) {
            set.add(curr);
            curr = curr.next;
        }

        Node temp = secondHead;

        // Traverse the second linked list and check if any node is in the HashSet.
        while (temp != null) {
            if (set.contains(temp)) {
                return temp.data; // If an intersection is found, return the data value.
            }
            temp = temp.next;
        }

        return -1; // Return -1 if no intersection is found.
    }
}
