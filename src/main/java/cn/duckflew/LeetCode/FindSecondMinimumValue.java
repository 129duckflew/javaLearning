package cn.duckflew.LeetCode;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class FindSecondMinimumValue
{
    public int findSecondMinimumValue(TreeNode root) {
        if (root==null)return -1;
        Queue<TreeNode>queue=new ArrayDeque<>();
        int []arr=new int[100];
        int index=0;
        queue.add(root);
        while (!queue.isEmpty())
        {
            TreeNode top = queue.poll();
            arr[index++]=top.val;
            if (top.left!=null)queue.add(top.left);
            if (top.right!=null)queue.add(top.right);
        }
        Arrays.sort(arr,0,index);
        for (int i = 1; i < index; i++)
        {
            int cur=arr[i];
            if (cur!=arr[i-1])return cur;
        }
        return -1;
    }
}
