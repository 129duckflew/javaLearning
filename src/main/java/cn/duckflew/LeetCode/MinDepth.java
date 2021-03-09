package cn.duckflew.LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

public class MinDepth
{
    private int min =Integer.MAX_VALUE;
    public int minDepth(TreeNode root) {
        if (root==null)return 0;
        Queue<TreeNode>queue=new ArrayDeque<>();
        Queue<Integer>depthQueue= new ArrayDeque<>();
        queue.add(root);
        depthQueue.add(1);
        int curDepth=1;
        while (!queue.isEmpty())
        {
            TreeNode top=queue.poll();
             curDepth=depthQueue.poll();
            if (top.left==null&&top.right==null)return curDepth;
            if (top.left!=null)
            {
                queue.add(top.left);
                depthQueue.add(curDepth+1);
            }
            if (top.right!=null)
            {
                queue.add(top.right);
                depthQueue.add(curDepth+1);
            }
        }
        return curDepth;
    }
    public void  dfs(TreeNode root,int sum)
    {
        if (root==null)
        {
            return ;
        }
        if (root.left==null&&root.right==null)min=Math.min(sum,min);
         dfs(root.left,sum+1);
         dfs(root.right,sum+1);
    }
}
