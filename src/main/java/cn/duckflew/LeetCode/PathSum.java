package cn.duckflew.LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class PathSum
{
    public int pathSum(TreeNode root, int sum) {
        if (root==null)return 0;
        return dfs(root,sum);
    }
    public int  dfs(TreeNode root, int sum)
    {
        if (root==null)return 0;
        int res=0;
        if (sum==root.val)res++;
        res=res+dfs(root.left,sum-root.val)+dfs(root.left,sum-root.val);
        return res;
    }
}

