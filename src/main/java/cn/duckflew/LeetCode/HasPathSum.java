package cn.duckflew.LeetCode;

import com.mysql.cj.protocol.ResultsetRow;

import java.util.ArrayDeque;
import java.util.Queue;

public class HasPathSum
{
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)return false;
//        if (root==null)return false;
//        if (root.left==null&&root.right==null)return sum==root.val;
//        return (hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val));
        Queue<TreeNode> nodeQueue=new ArrayDeque<>();
        Queue<Integer>pathQueue=new ArrayDeque<>();
        nodeQueue.add(root);
        pathQueue.add(root.val);
        while (!nodeQueue.isEmpty())
        {
            TreeNode cur=nodeQueue.poll();
            int curSum=pathQueue.poll();
            if (cur.left==null&&cur.right==null&&curSum==sum)
                return true;
            if  (cur.left!=null)
            {
                nodeQueue.add(cur.left);
                pathQueue.add(curSum+cur.left.val);
            }
             if  (cur.right!=null)
            {
                nodeQueue.add(cur.right);
                pathQueue.add(curSum+cur.right.val);
            }
        }
        return false;
    }

}
