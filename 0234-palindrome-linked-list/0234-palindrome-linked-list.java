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
    public boolean isPalindrome(ListNode head) {
        ListNode ptrFast = head;
        ListNode ptrSlow = head;

        while (ptrFast != null && ptrFast.next != null) {
            ptrFast = ptrFast.next.next;
            ptrSlow = ptrSlow.next;
        }
        if (ptrFast != null) {
            ptrSlow = ptrSlow.next;
        }
        
        ListNode secondHalf = this.reverseList(ptrSlow);
        ListNode ptr = head;
        while (secondHalf != null) {
            if (secondHalf.val != ptr.val) {
                return false;
            }
            secondHalf = secondHalf.next;
            ptr = ptr.next;
        }
        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode headNode = head;
        ListNode ptr = head;
        while (ptr != null && ptr.next != null) {
            ListNode temp = ptr.next;
            ptr.next = temp.next;
            temp.next = head;
            head = temp;
        }

        return head;
    }
}