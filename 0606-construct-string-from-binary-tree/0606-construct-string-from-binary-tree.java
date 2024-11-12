/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        res.append(String.valueOf(root.val));
        
        if (root.left == null && root.right == null) {
            return res.toString();
        }

        res.append("(");
        res.append(tree2str(root.left));
        res.append(")");


        if (root.right != null) {
            res.append("(");
            res.append(tree2str(root.right));
            res.append(")");
        }

        return res.toString();
    }
}