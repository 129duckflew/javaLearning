package cn.duckflew.LeetCode;

public class IsSymmetric
{
    public boolean isSymmetric(TreeNode root) {
        if (root==null)return true;
        return twoTreeIsMirroring(root.left,root.right);
    }
    public boolean twoTreeIsMirroring(TreeNode t1,TreeNode t2)
    {
        if (t1==null&&t2==null)return true;
        if (t1==null||t2==null)return false;
        return t1.val==t2.val&&twoTreeIsMirroring(t1.left, t2.right)&&twoTreeIsMirroring(t1.right,t2.left);
    }
}
