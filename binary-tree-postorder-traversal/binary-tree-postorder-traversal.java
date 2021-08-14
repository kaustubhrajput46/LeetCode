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
     public List<Integer> postorderTraversal(TreeNode root){
        List<Integer> list = new LinkedList<>();
        if(root == null) return list;
        //CLR => CRL => LRC
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while(!stack1.isEmpty()){
            TreeNode pop = stack1.pop();
            stack2.push(pop);
            if(pop.left != null) stack1.push(pop.left);
            if(pop.right != null) stack1.push(pop.right);
        }
        
        while(!stack2.isEmpty()){
            list.add(stack2.pop().val);
        }
        
        return list;
    }
}
// class Solution {
//     List<Integer> in;
//     public List<Integer> postorderTraversal(TreeNode root) {
//         in = new ArrayList<Integer>();
//         helper(root);
//         return in;    
//     }
    
//     public void helper(TreeNode root){
//         if (root == null) return;        
//         helper(root.left);
//         helper(root.right);
//         in.add(root.val);
//     }
// }

