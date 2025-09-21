# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.ans = []

    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []
        
        self.inorderTraversal(root.left)
        self.ans.append(root.val)
        self.inorderTraversal(root.right)

        return self.ans
    
    def inorderTraversal2(self, root: Optional[TreeNode]) -> List[int]:
        if not root:
            return []

        stack = []
        while stack or root:
            while root:
                stack.append(root)
                root = root.left

            root = stack.pop()
            self.ans.append(root.val)
            root = root.right
        
        return self.ans
        