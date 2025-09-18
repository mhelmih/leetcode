# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        ans = []
        self.append(root, ans)
        return ans

    def append(self, root, arr):
        if root is not None:
            arr.append(root.val)
        if root is not None and root.left is not None:
            self.append(root.left, arr)
        if root is not None and root.right is not None:
            self.append(root.right, arr)
