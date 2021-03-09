package cn.duckflew.LeetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FindBottomLeftValue
{
    public int findBottomLeftValue(TreeNode root) {
        if (root==null)return 0;
        int res=0;
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            int levelNum=queue.size();
            for (int i = 0; i < levelNum; i++)
            {
                TreeNode top = queue.poll();
                if (i==0)res=top.val;
                if (top.left!=null)queue.add(top.left);
                if (top.right!=null)queue.add(top.right);
            }
        }
        return res;
    }
}