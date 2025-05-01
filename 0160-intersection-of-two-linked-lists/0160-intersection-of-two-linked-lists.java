/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Map<ListNode, Boolean> m = new HashMap<>();
        ListNode ptr = headA;
        while (ptr != null) {
            m.put(ptr, true);
            ptr = ptr.next;
        }

        ptr = headB;
        while (ptr != null) {
            if (m.containsKey(ptr)) {
                return ptr;
            }
            ptr = ptr.next;
        }

        return null;
    }
}