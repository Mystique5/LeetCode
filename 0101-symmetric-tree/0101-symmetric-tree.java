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
    //Approach 1 - recurtion
    /*   if(root==null)
            return true;
        return isMirror(root.left, root.right);*/

    //Approach 2 - iteration

        if(root==null)
            return true;
        Queue<TreeNode> left=new LinkedList<>();
        Queue<TreeNode> right=new LinkedList<>();
        left.offer(root.left);
        right.offer(root.right);

        while(!left.isEmpty() && !right.isEmpty())
        {
            TreeNode leftNode=left.poll();
            TreeNode rightNode=right.poll();

            if(leftNode==null && rightNode==null)
                continue;
            if(leftNode==null || rightNode==null)
                return false;
            if(leftNode.val!=rightNode.val)
                return false;
            
            left.offer(leftNode.left);
            left.offer(leftNode.right);
            right.offer(rightNode.right);
            right.offer(rightNode.left);
        }
        return true;
     
    }

   /* private boolean isMirror(TreeNode leftNode, TreeNode rightNode)
    {
        if(leftNode ==null && rightNode==null)
            return true;
        if(leftNode ==null || rightNode==null)
            return false;
        
        return (leftNode.val ==rightNode.val) && isMirror(leftNode.left, rightNode.right) && 
            isMirror(leftNode.right, rightNode.left);
    }*/

    
}