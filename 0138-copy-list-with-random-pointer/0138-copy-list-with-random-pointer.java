/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Node ptr = head;
        while (ptr != null) {
            Node temp = new Node(ptr.val);
            temp.next = ptr.next;
            ptr.next = temp;
            ptr = temp.next;
        }

        ptr = head;
        while (ptr != null) {
            if (ptr.random != null) {
                ptr.next.random = ptr.random.next;
            }

            if (ptr.next != null) {
                ptr = ptr.next.next;
            } else {
                ptr = ptr.next;
            }
        }

        Node newHead = head.next;
        Node ptrNew = head.next;
        Node ptrOld = head;
        while (ptrOld != null) {
            ptrOld.next = ptrOld.next.next;
            ptrOld = ptrOld.next;

            if (ptrNew.next != null) {
                ptrNew.next = ptrNew.next.next;
            } else {
                ptrNew.next = null;
            }
            ptrNew = ptrNew.next;
        }

        return newHead;
    }
}