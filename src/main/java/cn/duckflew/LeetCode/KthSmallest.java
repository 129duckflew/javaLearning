package cn.duckflew.LeetCode;


public class KthSmallest
{
    private int hasReadNum;
    int res;
    public int kthSmallest(TreeNode root, int k) {
         res=0;
        hasReadNum=0;
        dfs(root,k);
        return res;
    }
    public void dfs(TreeNode root,int k)
    {
        if (root==null)return ;
        dfs(root.left,k);
        hasReadNum++;
        if (hasReadNum==k)
        {
            res=root.val;
            return ;
        }
        else if (hasReadNum>k)
        {
            return;
        }
        dfs(root.right,k);
    }
}
