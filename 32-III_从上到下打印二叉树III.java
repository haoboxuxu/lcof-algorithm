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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            LinkedList<Integer> temp = new LinkedList<>();
            for (int i = q.size(); i > 0; i--) {
                TreeNode node = q.poll();
                if (res.size() % 2 == 0) {
                    temp.addLast(node.val);
                }else {
                    temp.addFirst(node.val);
                }
                
                if (node.left != null) {
                    q.offer(node.left);
                }
                if (node.right != null) {
                    q.offer(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}
