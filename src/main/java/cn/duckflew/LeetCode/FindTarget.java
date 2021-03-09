package cn.duckflew.LeetCode;

import java.util.*;

public class FindTarget
{
    private List<Integer> list;
    public boolean findTarget(TreeNode root, int k) {
        list=new ArrayList<>();
        dfs(root);
        int left=0;
        int right=list.size()-1;
        while (left<right)
        {
            int curSum=list.get(left)+list.get(right);
            if (curSum==k)return true;
            else if (curSum>k)
            {
                right--;
            }
            else  left++;
        }
        return false;
    }
    public void dfs(TreeNode root)
    {
        if (root!=null)
        {
            dfs(root.left);
            list.add(root.val);
            dfs(root.right);
        }
    }
}
