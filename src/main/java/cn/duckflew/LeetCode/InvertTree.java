package cn.duckflew.LeetCode;

public class InvertTree
{
    public TreeNode invertTree(TreeNode root) {
        invertTreeNode(root);
        return root;
    }
    public void invertTreeNode(TreeNode root)
    {
        if (root==null)return ;
        invertTree(root.left);
        invertTree(root.right);
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
    }
}
