package cn.duckflew.LeetCode;

public class LongestUnivaluePath
{
    private int max=Integer.MIN_VALUE;
    public int longestUnivaluePath(TreeNode root) {
       if (root==null)return 0;
       postOrder(root);
       return max;
    }
    public int postOrder(TreeNode root)
    {
        if (root==null)
        {
            return 0;
        }
        int leftArrow=0;
        int rightArrow=0;
        int leftValue=postOrder(root.left);
        int rightValue=postOrder(root.right);
        if (root.left!=null&&root.left.val==root.val)
        {
            leftArrow=(leftValue+1);
        }
        if (root.right!=null&&root.right.val==root.val)
        {
            rightArrow=(rightValue+1);
        }
        max=Math.max(max,leftArrow+rightArrow);
        return Math.max(leftArrow,rightArrow);
    }

    public static void main(String[] args)
    {
        Integer[] data = {5, 4, 5, 4, 4, 5, 3, 4, 4, null, null, null, 4, null, null, 4, null, null, 4, null, 4, 4, null, null, 4, 4};
        TreeNode root = BuildTree.constructTree(data);

        LongestUnivaluePath path = new LongestUnivaluePath();
        System.out.println(path.longestUnivaluePath(root));
    }
}
