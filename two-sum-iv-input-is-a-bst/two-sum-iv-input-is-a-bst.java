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
    Set<Integer> set;
    public boolean findTarget(TreeNode root, int k) {
        if ( root == null ) return false;
        if ((root.left == null) && (root.right == null) )
            return false;
        
        
        set = new HashSet<Integer>();
        return helper(root, k);
        // return false;
        
    }
    
    public boolean helper(TreeNode node, int k){
        if(node == null) return false;
        if(set.contains(node.val)) return false;
        if(set.contains(k - node.val)) return true;
        else {
            set.add(node.val);
            if(helper(node.left, k)) return true;
            if(helper(node.right, k)) return true;
        }
        return false;
    }
    
    
    
    
}