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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> levelOrder = new ArrayList<List<Integer>>();
        if (root == null) return levelOrder;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        List<Integer> lvl;
        while(!queue.isEmpty()){
            lvl = new ArrayList<>();
            // System.out.println(queue.size());
            int size = queue.size();
            for(int i = 0; i < size; i++ ){
                TreeNode curr = queue.poll();
                
                if(curr.left != null){ queue.offer(curr.left); }
                if(curr.right != null){ queue.offer(curr.right); }
                lvl.add(curr.val);
            }
            levelOrder.add(lvl);
        } 
        
        
        return levelOrder;
    }
}