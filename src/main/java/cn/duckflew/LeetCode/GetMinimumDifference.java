package cn.duckflew.LeetCode;

public class GetMinimumDifference
{
    private int pre;
    private int minValue;
    public int getMinimumDifference(TreeNode root) {
        pre=-1;
        minValue=Integer.MAX_VALUE;
        iterator(root);
        return minValue;
    }
    public void iterator(TreeNode root)
    {
        if (root!=null)
        {
            iterator(root.left);
            if (pre != -1)
            {
                minValue = Math.min(minValue, root.val - pre);
            }
            pre=root.val;
            iterator(root.right);
        }
    }

    public static void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        root.left=null;
        root.right=new TreeNode(3);
        TreeNode p=root.right;
        p.left=new TreeNode(2);
        System.out.println(new GetMinimumDifference().getMinimumDifference(root));
    }
}
