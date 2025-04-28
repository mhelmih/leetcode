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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode prevHead = new ListNode();
        ListNode idx = prevHead;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                idx.next = list2;
                list2 = list2.next;
            } else {
                idx.next = list1;
                list1 = list1.next;
            }

            idx = idx.next;
        }

        if (list1 != null) {
            idx.next = list1;
        } else {
            idx.next = list2;
        }

        return prevHead.next;
    }
}