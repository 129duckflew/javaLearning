package cn.duckflew.LeetCode;

public class DiameterOfBinaryTree
{
     int max;
    public  int diameterOfBinaryTree(TreeNode root)
    {
        if (root==null)return 0;
        max=0;
        maxDanZhi(root);
        return max-1;
    }
    public  int maxDanZhi(TreeNode root)
    {
        if (root==null)return 0;
        int left=maxDanZhi(root.left);
        int right=maxDanZhi(root.right);
        System.out.println("left="+left);
        System.out.println("right="+right);
        max=Math.max(max,left+right+1);
        System.out.println("max="+max);
        return Math.max(left,right)+1;
    }

    public  void main(String[] args)
    {
        TreeNode root = new TreeNode(1);
        TreeNode p=root;
        for (int i = 0; i < 5; i++)
        {
            p.left=new TreeNode(i+1);
            p=p.left;
        }
        System.out.println(diameterOfBinaryTree(root));
    }
}
