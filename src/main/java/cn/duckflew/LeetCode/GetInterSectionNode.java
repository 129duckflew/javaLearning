package cn.duckflew.LeetCode;

class ListNode
{
    int val;
    ListNode next;

    public ListNode(int val)
    {
        this.val = val;
        next=null;
    }
}
public class GetInterSectionNode
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        ListNode pa=headA;
        ListNode pb=headB;
        while (pa!=pb)
        {
            if (pa!=null)pa=pa.next;
            else pa=headB;
            if (pb!=null)pb=pb.next;
            else pb=headA;

        }
        return pa;
    }
}
