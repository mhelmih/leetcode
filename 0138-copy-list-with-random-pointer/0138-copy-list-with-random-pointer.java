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
        HashMap<Node, Node> oldToNew = new HashMap<>();
        Node ptr = head;
        while (ptr != null) {
            oldToNew.put(ptr, new Node(ptr.val));
            ptr = ptr.next;
        }

        ptr = head;
        Node ptrNew = oldToNew.get(ptr);
        while (ptr != null) {
            ptrNew.next = oldToNew.get(ptr.next);
            ptrNew.random = oldToNew.get(ptr.random);
            ptrNew = ptrNew.next;
            ptr = ptr.next;
        }

        return oldToNew.get(head);
    }
}