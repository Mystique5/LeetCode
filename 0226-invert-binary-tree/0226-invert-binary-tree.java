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
    public TreeNode invertTree(TreeNode root) {
        
        if(root==null)
            return null;
    //1. Approach 1-- Iterative method
       /* Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        // int i=0;

        while(!q.isEmpty())
        {
        //Print for checking the queue at each iteration
            // System.out.println("Iteration no : "+ i++ +" -->");
            // for (TreeNode node : q) {
            // System.out.print(node.val + " ");
            // }


            System.out.println();
            TreeNode node=q.poll();
            TreeNode temp=node.left;
            node.left=node.right;
            node.right=temp;

            if(node.left !=null)
                q.offer(node.left);
            if(node.right !=null)
                q.offer(node.right);      
        }
        return root;*/
    
    //2. Approach 2 --> Recurtion Method

        TreeNode left= invertTree(root.left);
        TreeNode right= invertTree(root.right);

        root.left=right;
        root.right=left;


        return root;
    }
}