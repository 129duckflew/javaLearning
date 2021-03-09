package cn.duckflew.LeetCode;

import java.util.*;

public class AverageOfLevels
{
    public static List<Double> averageOfLevels(TreeNode root) {
        if (root==null)return null;
        List<Double>averages=new ArrayList<>();
        Queue<TreeNode>queue=new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty())
        {
            long levelSum=0;
            int levelNum=queue.size();
            for (int i = 0; i < levelNum; i++)
            {
                TreeNode top = queue.poll();
                levelSum+=top.val;
                if (top.left!=null)queue.add(top.left);
                if (top.right!=null)queue.add(top.right);
            }
            averages.add(levelSum/(levelNum*1.0));
        }
        return averages;
    }

    public static void main(String[] args)
    {
        System.out.println(2147483647+2147483647);
        TreeNode root = new TreeNode(2147483647);
        root.left=new TreeNode(2147483647);
        root.right=new TreeNode(2147483647);
        System.out.println(averageOfLevels(root));
    }
}
