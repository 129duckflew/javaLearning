package cn.duckflew.LeetCode;

public class SplitListToParts
{
    public ListNode[] splitListToParts(ListNode root,int k)
    {
        ListNode p=root;
        int len=0;
        while (p!=null)
        {
            len++;
            p=p.next;
        }
        ListNode res[]=new ListNode[k];
        int surplus=len%k;
        int baseNumOfEveryElement=len/k;
        ListNode cur=root;
        for (int i = 0; i < res.length; i++)
        {
            ListNode head=cur;
            res[i]=head;
            int sonListLength=baseNumOfEveryElement+(i<surplus?1:0);
            for (int j = 1; j < sonListLength; j++)
            {
                if (cur!=null)cur=cur.next;
            }
            if (cur!=null)
            {
                ListNode next=cur.next;
                cur.next=null;
                cur=next;
            }
        }
        return res;
    }
}
