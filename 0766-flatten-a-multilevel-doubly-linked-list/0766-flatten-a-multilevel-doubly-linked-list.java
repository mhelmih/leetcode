/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) {
            return head;
        }
        Node ptr = head;
        while (ptr != null) {
            if (ptr.child != null) {
                Node ptrNext = ptr.next;
                Node ptrChild = ptr.child;
                ptr.next = ptrChild;
                ptrChild.prev = ptr;
                ptr.child = null;
                ptrChild = this.flattenRecursion(ptrChild);
                ptrChild.next = ptrNext;
                if (ptrNext != null) {
                    ptrNext.prev = ptrChild;
                }
            }
            ptr = ptr.next;
        }

        return head;
    }

    // return the end node of the child list
    public Node flattenRecursion(Node head) {
        if (head.next == null && head.child == null) {
            return head;
        }
        Node ptr = head;
        while (ptr.next != null) {
            if (ptr.child != null) {
                Node ptrNext = ptr.next;
                Node ptrChild = ptr.child;
                ptr.next = ptrChild;
                ptrChild.prev = ptr;
                ptr.child = null;
                ptrChild = this.flattenRecursion(ptrChild);
                ptrChild.next = ptrNext;
                ptrNext.prev = ptrChild;
            }
            if (ptr.next != null) {
                ptr = ptr.next;
            }
        }

        return ptr;
    }
}