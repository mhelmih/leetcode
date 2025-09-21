# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return []

        ans = []
        queue = [[root]]
        for level in queue:
            temp_lv = []
            temp_ans = []
            for node in level:
                temp_ans.append(node.val)
                if node.left:
                    temp_lv.append(node.left)
                if node.right:
                    temp_lv.append(node.right)
            
            if temp_lv:
                queue.append(temp_lv)
            if temp_ans:
                ans.append(temp_ans)
        
        return ans  
