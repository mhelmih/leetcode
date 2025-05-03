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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }

        int length = 0;
        ListNode ptrFast = head;
        while (ptrFast != null) {
            length += 1;
            ptrFast = ptrFast.next;
        }

        int rotations = k % length;
        if (rotations == 0) {
            return head;
        }

        ptrFast = head;
        while (rotations > 1) {
            ptrFast = ptrFast.next;
            rotations--;
        }
        
        ListNode ptrSlow = head;
        ListNode ptrPrev = head;
        while (ptrFast.next != null) {
            ptrPrev = ptrSlow;
            ptrSlow = ptrSlow.next;
            ptrFast = ptrFast.next;
        }

        ptrPrev.next = null;
        ptrFast.next = head;
        head = ptrSlow;

        return head;
    }
}