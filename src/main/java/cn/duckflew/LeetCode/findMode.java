package cn.duckflew.LeetCode;

import java.util.ArrayList;
import java.util.List;

public class findMode
{
    private int cur;
    private int curNum;
    private int maxNum=-1;
    private List<Integer>res;
    public int[] findMode(TreeNode root) {
        res=new ArrayList<>();
        dfs(root);
        int []ans=new int[res.size()];
        if (res.size()>0)
        for (int i = 0; i < ans.length; i++)
        {
            ans[i]=res.get(i);
        }
        return ans;
    }
    public void dfs(TreeNode root)
    {
        if (root==null)return ;
        dfs(root.left);
        update(root.val);
        dfs(root.right);

    }
    public void update(int val)
    {
        if (val!=cur)
        {
            cur=val;
            curNum=1;
        }
        else
        {
            curNum++;
        }
        if (curNum>maxNum)
        {
            res.clear();
            res.add(cur);
            maxNum=curNum;
        }
        else if (curNum<maxNum)
        {

        }
        else
        {
            res.add(cur);
        }
    }
}
