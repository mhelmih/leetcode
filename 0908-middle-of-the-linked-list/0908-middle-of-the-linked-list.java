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
    public ListNode middleNode(ListNode head) {
        ListNode counter = head;
        ListNode ptr = head;
        int count = 0;
        
        while (counter != null) {
            counter = counter.next;
            count++;
        }

        int middle = count / 2 + 1;
        while (middle != 1) {
            ptr = ptr.next;
            middle--;
        }

        return ptr;
    }
}