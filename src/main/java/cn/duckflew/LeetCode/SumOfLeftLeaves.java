package cn.duckflew.LeetCode;

public class SumOfLeftLeaves
{
    private int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum=0;
        fun(root,false);
        return sum;
    }
    public void fun(TreeNode root,boolean isLeft)
    {
        if (root==null)return ;
        if (isLeft&&root.left==null&&root.right==null)
        {
            sum+=root.val;
            return ;
        }
        fun(root.left,true);
        fun(root.right,false);
    }
}
