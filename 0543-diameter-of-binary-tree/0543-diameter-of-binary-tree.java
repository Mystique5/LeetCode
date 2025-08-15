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

    static class Info{
        int ht, diam;
        Info(int ht, int diam)
        {
            this.ht=ht;
            this.diam=diam;
        }
    
    public Info diameter(TreeNode root)
    {
        if(root==null)
            return new Info(0,0);
        
        Info left=diameter(root.left);
        Info right=diameter(root.right);

        int diam1=left.diam;
        int diam2=right.diam;

        int myHeight=Math.max(left.ht, right.ht)+1;

        int diam3=left.ht+right.ht;
        int myDiam=Math.max(diam3, Math.max(diam1,diam2));

        return new Info(myHeight, myDiam);
    }
    }
    public int diameterOfBinaryTree(TreeNode root) {

        Info obj=new Info(0,0);
        return obj.diameter(root).diam;   
    }
}