package cn.duckflew.LeetCode;

public class MaxDepth
{
    public int maxDepth(TreeNode root) {
        if (root==null)return 0;
        return Integer.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if (root==null)return true;
        return Math.abs(maxDepth(root.left)-maxDepth(root.right))<=1;
    }
}
