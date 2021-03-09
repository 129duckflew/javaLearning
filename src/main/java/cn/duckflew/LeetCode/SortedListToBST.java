package cn.duckflew.LeetCode;

import java.util.HashMap;

public class SortedListToBST
{
    public static  TreeNode sortedListToBST(ListNode head) {
        return buildTree(head,null);
    }
    public static TreeNode buildTree(ListNode left,ListNode right)
    {
        if (left==right)return null;
        ListNode mid = findMidListNode(left, right);
        TreeNode newNode = new TreeNode(mid.val);
        newNode.left=buildTree(left,mid);
        newNode.right=buildTree(mid.next,right);
        return newNode;
    }
    public static ListNode findMidListNode(ListNode left,ListNode right)
    {
        System.out.println("left="+(left==null?"null":left.val)+" right="+(right==null?"null":right.val));
        if (left==right)return null;
        ListNode slow=left;
        ListNode fast=left;
        while (fast!=right&&fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
            fast=fast.next;
            System.out.println("slow="+slow.val+"  fast="+fast.val);
        }
        return slow;
    }

    public static void main(String[] args)
    {
        ListNode head = new ListNode(-10);
        ListNode p=head;
        int []data={-10,-3,0,5,9};
        for (int i = 1; i < data.length; i++)
        {
            p.next=new ListNode(data[i]);
            p=p.next;
        }
        TreeNode root = sortedListToBST(head);
    }
}
