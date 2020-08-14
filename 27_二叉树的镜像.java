/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = mirrorTree(root.left);
        TreeNode right = mirrorTree(root.right);
        swapTreeNode(root, left, right);
        return root;
    }

    private static void swapTreeNode(TreeNode root, TreeNode left, TreeNode right) {
        root.left = right;
        root.right = left;
    }
}
