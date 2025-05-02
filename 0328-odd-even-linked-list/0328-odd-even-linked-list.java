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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode ptrOdd = head;
        ListNode ptrEven = head.next;
        ListNode evenHead = new ListNode();
        evenHead = ptrEven;

        while (ptrEven != null && ptrEven.next != null) {
            if (ptrEven.next != null) {
                ptrOdd.next = ptrEven.next;
            }
            if (ptrOdd.next != null) {
                ptrEven.next = ptrOdd.next.next;
            }
            ptrOdd = ptrOdd.next;
            ptrEven = ptrEven.next;
        }
        ptrOdd.next = evenHead;

        return head;
    }
}