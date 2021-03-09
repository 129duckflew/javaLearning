package cn.duckflew.LeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ListReverse
{
    public ListNode reverseList(ListNode head)
    {
        if (head==null)return null;
        ListNode pre=null;
        ListNode cur=head;
        while (true)
        {
            if (cur.next==null)
            {
                cur.next=pre;
                return cur;
            }
            ListNode next = cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
    }
    public boolean isPalindrome(ListNode head) {
        ListNode p=head;
        long seed=17;
        long hash1=0;
        long hash2=0;
        long index=1;  //累计到现在的指数与种子的乘积
        while (p!=null)
        {
            hash1=hash1*seed+p.val;
            hash2=hash2+index*p.val;
            index*=seed;
            p=p.next;
        }
        return hash1==hash2;
    }
}
