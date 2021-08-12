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
    List<Integer> in = new ArrayList<Integer>();
    public List<Integer> inorderTraversal(TreeNode root) {
        
        helper(root);
        return in;
    }
    
    public void helper(TreeNode root){
        if (root == null) return;        
        helper(root.left);
        in.add(root.val);
        helper(root.right);
        
        // return in;
    }
        
        
}

// class Solution {
//     public List<Integer> inorderTraversal(TreeNode root) {
        
//         List<Integer> in = new ArrayList<Integer>();
//         if (root == null) return in;
        
//         in.addAll(inorderTraversal(root.left));
//         in.add(root.val);
//         in.addAll(inorderTraversal(root.right));
        
//         return in;
//     }
// }