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

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> in = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        // stack.push(root);
        TreeNode curr = root;
        while(!stack.isEmpty() || curr != null){
            while(curr != null){
                stack.push(curr);
                curr= curr.left; 
            }
            curr = stack.pop();
            in.add(curr.val);
            curr = curr.right;
            
        }
        
        return in;
    }
    
}

//stack


// class Solution {
//     List<Integer> in;
//     public List<Integer> inorderTraversal(TreeNode root) {
//         in = new ArrayList<Integer>();
//         helper(root);
//         return in;
//     }
    
//     public void helper(TreeNode root){
//         if (root == null) return;        
//         helper(root.left);
//         in.add(root.val);
//         helper(root.right);
//     }
// }



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