# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapPairs(self, head: Optional[ListNode]) -> Optional[ListNode]:
        if not head:
            return

        ptr1 = head
        ptr2 = ptr1.next
        ptr3 = None
        
        if ptr2:
            ptr3 = ptr2.next
            if ptr3 and ptr3.next:
                ptr1.next = ptr3.next
            else:
                ptr1.next = ptr3
            ptr2.next = ptr1

        if ptr3:
            self.swapPairs(ptr3)
        else:
            self.swapPairs

        if ptr2:
            return ptr2
        return head