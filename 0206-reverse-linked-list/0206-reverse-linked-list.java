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
    public ListNode reverseList(ListNode head) {
        ListNode toHead = new ListNode();
        toHead.next = head;

        ListNode ptr = head;
        while (ptr != null && ptr.next != null) {
            ListNode temp = ptr.next;
            ptr.next = temp.next;
            temp.next = toHead.next;
            toHead.next = temp;
        }

        return toHead.next;
    }
}