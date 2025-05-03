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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode ans = new ListNode();
        ListNode ansHead = ans;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int remainder = 0;
        while (ptr1 != null && ptr2 != null) {
            ans.val = (ptr1.val + ptr2.val + remainder) % 10;
            remainder = (ptr1.val + ptr2.val + remainder) / 10;
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
            
            if (ptr1 != null || ptr2 != null) {
                ListNode temp = new ListNode();
                ans.next = temp;
                ans = ans.next;
            }
        }

        while (ptr1 != null) {
            ans.val = (ptr1.val + remainder) % 10;
            remainder = (ptr1.val + remainder) / 10;
            ptr1 = ptr1.next;

            if (ptr1 != null) {
                ListNode temp = new ListNode();
                ans.next = temp;
                ans = ans.next;
            }
        }

        while (ptr2 != null) {
            ans.val = (ptr2.val + remainder) % 10;
            remainder = (ptr2.val + remainder) / 10;
            ptr2 = ptr2.next;
            
            if (ptr2 != null) {
                ListNode temp = new ListNode();
                ans.next = temp;
                ans = ans.next;
            }
        }

        if (remainder != 0) {
            ListNode temp = new ListNode(remainder);
            ans.next = temp;
            ans = ans.next;
        }

        return ansHead;
    }
}