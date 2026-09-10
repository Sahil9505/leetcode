/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return dfs(root, root.val);
    }

    private int dfs(TreeNode root, int max_val) {
        if (root == null) {
            return 0;
        }

        int curr_node_good = 0;
        if (root.val >= max_val) {
            curr_node_good = 1;
        }

        max_val = Math.max(max_val, root.val);

        int left = dfs(root.left, max_val);
        int right = dfs(root.right, max_val);

        return curr_node_good + left + right;
    }
}
