package cn.duckflew.LeetCode;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree
{
    public static TreeNode build(Integer[] data,int index)
    {
        TreeNode newNode=null;
        if (index<data.length&&data[index]!=null)
        {
            newNode=new TreeNode(data[index]);
            newNode.left=build(data,index*2+1);
            newNode.right=build(data,index*2+2);
        }
        return newNode;
    }
    public static TreeNode constructTree(Integer[] nums){
        if (nums.length == 0) return new TreeNode(0);
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        // 创建一个根节点
        TreeNode root = new TreeNode(nums[0]);
        nodeQueue.offer(root);
        TreeNode cur;
        // 记录当前行节点的数量（注意不一定是2的幂，而是上一行中非空节点的数量乘2）
        int lineNodeNum = 2;
        // 记录当前行中数字在数组中的开始位置
        int startIndex = 1;
        // 记录数组中剩余的元素的数量
        int restLength = nums.length - 1;

        while(restLength > 0) {
            // 只有最后一行可以不满，其余行必须是满的
//            // 若输入的数组的数量是错误的，直接跳出程序
//            if (restLength < lineNodeNum) {
//                System.out.println("Wrong Input!");
//                return new TreeNode(0);
//            }
            for (int i = startIndex; i < startIndex + lineNodeNum; i = i + 2) {
                // 说明已经将nums中的数字用完，此时应停止遍历，并可以直接返回root
                if (i == nums.length) return root;
                cur = nodeQueue.poll();
                if (nums[i] != null) {
                    cur.left = new TreeNode(nums[i]);
                    nodeQueue.offer(cur.left);
                }
                // 同上，说明已经将nums中的数字用完，此时应停止遍历，并可以直接返回root
                if (i + 1 == nums.length) return root;
                if (nums[i + 1] != null) {
                    cur.right = new TreeNode(nums[i + 1]);
                    nodeQueue.offer(cur.right);
                }
            }
            startIndex += lineNodeNum;
            restLength -= lineNodeNum;
            lineNodeNum = nodeQueue.size() * 2;
        }

        return root;
    }
    public static void preOrder(TreeNode root)
    {
        if (root!=null)
        {
            System.out.print(root.val+" ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    public static void InOrder(TreeNode root)
    {
        if (root!=null)
        {
            InOrder(root.left);
            System.out.print(root.val+" ");
            InOrder(root.right);
        }
    }
    public static void postOrder(TreeNode root)
    {
        if (root!=null)
        {
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val+" ");
        }
    }

    public static void main(String[] args)
    {
        Integer[] data = {1, 2, 3, null, 4, 5, 6, 7, null};
        TreeNode root = constructTree(data);
        preOrder(root);
        System.out.println("前序");
        InOrder(root);
        System.out.println("zhong序");
        postOrder(root);
        System.out.println("hou序");
    }
}
