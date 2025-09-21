# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.ans = []

    def postorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if root is None:
            return []

        return self.postorderTraversal(root.left) + self.postorderTraversal(root.right) + [root.val]

    def postorderTraversal2(self, root: Optional[TreeNode]) -> List[int]:
        if root is None:
            return []

        self.postorderTraversal(root.left)
        self.postorderTraversal(root.right)
        self.ans.append(root.val)
        
        return self.ans
    
    def postorderTraversal3(self, root: Optional[TreeNode]) -> List[int]:
        if root is None:
            return []

        stack = [root]
        while stack:
            curr = stack.pop()
            self.ans.append(curr.val)

            if curr.left:
                stack.append(curr.left)
            if curr.right:
                stack.append(curr.right)
        
        return self.ans[::-1]
        