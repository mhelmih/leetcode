# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: Optional[TreeNode]) -> bool:
        if not root:
            return True
        return self.isMirror(root.left, root.right)
    
    def isMirror(self, n1: Optional[TreeNode], n2: Optional[TreeNode]) -> bool:
        if not n1 and not n2:
            return True
        if not n1 or not n2:
            return False
        # print("n1", n1.val, "n2", n2.val)
        if n1 and n2 and n1.val != n2.val:
            return False
        return self.isMirror(n1.left, n2.right) and self.isMirror(n1.right, n2.left)