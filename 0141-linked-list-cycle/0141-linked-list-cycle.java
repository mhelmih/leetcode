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
    public boolean hasCycle(ListNode head) {
        ListNode ptrFast = head;
        ListNode ptrSlow = head;
        while (ptrFast != null && ptrFast.next != null) {
            ptrFast = ptrFast.next.next;
            ptrSlow = ptrSlow.next;

            if (ptrFast == ptrSlow) {
                return true;
            }
        }

        return false;
    }
}