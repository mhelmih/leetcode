# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if (p is not None) ^ (q is not None):
            return False

        if p is None and q is None:
            return True
        
        ps = [p]
        qs = [q]
        while ps and qs:
            p_curr = ps.pop()
            q_curr = qs.pop()

            if p_curr.val != q_curr.val:
                return False
            
            if not ((p_curr.right is not None) ^ (q_curr.right is not None)):
                if p_curr.right and q_curr.right:
                    ps.append(p_curr.right)
                    qs.append(q_curr.right)
            else:
                return False

            if not ((p_curr.left is not None) ^ (q_curr.left is not None)):
                if p_curr.left and q_curr.left:
                    ps.append(p_curr.left)
                    qs.append(q_curr.left)
            else:
                return False
        
        return True
        
