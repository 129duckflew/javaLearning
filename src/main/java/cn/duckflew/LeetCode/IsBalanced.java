package cn.duckflew.LeetCode;

public class IsBalanced
{
    /**
     *
     * @param root
     * @return
     */
    public int postOrder(TreeNode root)
    {
        if (root==null)return 0;
        int leftDepth=postOrder(root.left);
        if (leftDepth==-1)return -1;
        int rightDepth=postOrder(root.right);
        if (rightDepth==-1)return -1;
        return Math.abs(leftDepth-rightDepth)<2?Math.max(leftDepth,rightDepth)+1:-1;
    }
    public boolean isBalanced(TreeNode root)
    {
        return postOrder(root)!=-1;
    }
}
