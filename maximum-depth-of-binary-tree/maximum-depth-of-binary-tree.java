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
    int ans = 0;
    int depth;
    public int maxDepth(TreeNode root) {
        depth = 0;
        helper(root, depth);
        
        return ans;
    }
    
    
    public void helper(TreeNode node, int depth){
        if (node == null) return;
        depth = depth +1;
        if (ans < depth ) ans = depth;
        //left tree
        helper(node.left, depth);
        //right tree
        helper(node.right, depth);
    }
}