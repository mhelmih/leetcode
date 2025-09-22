# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.temp_sum = 0

    def hasPathSum(self, root: Optional[TreeNode], targetSum: int) -> bool:
        if not root:
            return False

        stack = [root]
        val_stack = [root.val]
        while stack:
            curr = stack.pop()
            # print("curr", curr.val)
            self.temp_sum += curr.val
            # print("temp_sum", self.temp_sum)
            if self.temp_sum == targetSum and not curr.left and not curr.right:
                return True
            else:
                if not curr.left and not curr.right:
                    self.temp_sum = val_stack.pop()
                if curr.right and curr.left:
                    val_stack.append(self.temp_sum)
                if curr.right:
                    stack.append(curr.right)
                if curr.left:
                    stack.append(curr.left)

        return False
