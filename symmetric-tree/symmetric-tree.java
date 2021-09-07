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
    public boolean isSymmetric(TreeNode root) {
        if (root.left == null && root.right == null) return true;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        
        left(root.left, left);
        right(root.right, right);
        
        if(!left.equals(right)) return false;
        return true;
    }

    public void left(TreeNode node, List<Integer> list){
        if (node == null) {
            list.add(101);
            return;
        }
        list.add(node.val);
        left(node.right, list);
        left(node.left, list);
    }
    public void right(TreeNode node, List<Integer> list){
        if (node == null) {
            list.add(101);
            return;
        }
        list.add(node.val);
        right(node.left, list);
        right(node.right, list);
    }
}