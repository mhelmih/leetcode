/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode ptrFast = head;
        ListNode ptrSlow = head;
        while (ptrFast != null && ptrFast.next != null) {
            ptrFast = ptrFast.next.next;
            ptrSlow = ptrSlow.next;

            if (ptrFast == ptrSlow) {
                ptrSlow = head;
                while (ptrSlow != ptrFast) {
                    ptrSlow = ptrSlow.next;
                    ptrFast = ptrFast.next;
                }

                return ptrSlow;
            }
        }

        return null;
    }
}