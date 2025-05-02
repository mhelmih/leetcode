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
    public ListNode removeElements(ListNode head, int val) {
        ListNode ptr1 = head;
        ListNode ptr2 = new ListNode();
        ListNode ptr3 = new ListNode();
        ptr2.next = head;

        while (ptr1 != null) {
            if (ptr1.val == val) {
                ptr2.next = ptr1.next;
                if (ptr1 == head) {
                    head = ptr1.next;
                }
            } else {
                ptr2 = ptr1;
            }
            ptr1 = ptr1.next;
        }

        return head;
    }
}