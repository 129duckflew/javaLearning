package cn.duckflew.LeetCode;

public class LIstMerge
{
    public ListNode mergeTwoLists(ListNode l1, ListNode l2)
    {
        if (l1==null)return l2;
        if (l2==null)return l1;
        ListNode p1=l1;
        ListNode p2=l2;
        ListNode res;
        if (p1.val<p2.val)
        {
            res = new ListNode(p1.val);
            p1=p1.next;
        }
        else
        {
            res = new ListNode(p2.val);
            p2=p2.next;
        }
        ListNode resP=res;
        while (p1!=null&&p2!=null)
        {
            if (p1.val<p2.val)
            {
//                System.out.println(p1.val+"比"+p2.val+"小 插入结果链表");
                resP.next = new ListNode(p1.val);
                p1=p1.next;
//                System.out.println("p1后移");
            }
            else
            {
//                System.out.println(p2.val+"比"+p1.val+"小 插入结果链表");
                resP.next = new ListNode(p2.val);
                p2=p2.next;
//                System.out.println("p2后移");
            }
            resP=resP.next;
        }
        while (p1!=null)
        {
//            System.out.println("p2已经空了依次吧p2所有的放入结果链表");
            resP.next= new ListNode(p1.val);
            resP=resP.next;
            p1=p1.next;
        }
        while (p2!=null)
        {
//            System.out.println("p1已经空了依次吧p2所有的放入结果链表");
            resP.next = new ListNode(p2.val);
            resP=resP.next;
            p2=p2.next;
        }
        return res;
    }
}
