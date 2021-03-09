package cn.duckflew.LeetCode;

public class IsSubtree
{
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t==null)return true;
        /**
         * 如果t等于null 那么t就是任何树的子树  因为 任何一棵树都有null节点
         */
        if (s==null)return false;
        /**
         * 如果s==null 那么s不可能有子树 除非t也等于null 但是这种情况在前面已经是判断了的
         */
        return treeEquals(s, t)||isSubtree(s.left,t)||isSubtree(s.right,t);
    }

    /**
     * 判断树是否相等的递归函数
     * @param t1
     * @param t2
     * @return
     */
    public boolean treeEquals(TreeNode t1,TreeNode t2)
    {
        if (t1==null)return t2==null;  //同时为null 相等
        if (t2==null)return false;  //后面的为Null  就不相等
        if (t1.val!=t2.val)return false;  //两个根节点的值不相等那就是两棵树不相等
        /**
         * 然后递归 左子树和柚子树  只有左右子树同时相等 树才能相等
         */
        return treeEquals(t1.left,t2.left)&&treeEquals(t1.right,t2.right);

    }
}
