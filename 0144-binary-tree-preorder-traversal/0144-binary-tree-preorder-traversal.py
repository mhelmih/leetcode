# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.ans = []

    def preorderTraversal2(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []

        self.ans.append(root.val)
        self.preorderTraversal(root.left)
        self.preorderTraversal(root.right)
        return self.ans

    def preorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []

        stack = []
        stack.append(root)
        while stack:
            curr = stack.pop()
            self.ans.append(curr.val)
            if curr.right:
                stack.append(curr.right)
            if curr.left:
                stack.append(curr.left)
        
        return self.ans
