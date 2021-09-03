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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        if ((root.val == targetSum) && ((root.left == null) && (root.right == null)))  return true;
        return (helper(root.left, root.val, targetSum) ||
                helper(root.right, root.val, targetSum));
    }
    
    public boolean helper(TreeNode node, int pathSum, int targetSum){
        if (node == null) return false;
        if((node.left == null) && (node.right == null)) {
            if(pathSum +node.val == targetSum) return true;
            else return false;
        }
        return (helper(node.left, pathSum + node.val, targetSum) ||
                helper(node.right, pathSum + node.val, targetSum));        
    }
}