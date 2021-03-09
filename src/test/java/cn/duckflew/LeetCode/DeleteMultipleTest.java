package cn.duckflew.LeetCode;

import junit.framework.TestCase;

public class DeleteMultipleTest extends TestCase
{
    public void testDeleteMultipleDataInList()
    {
        ListNode head = new ListNode(1);
        ListNode p=head;
        p.next=new ListNode(1);
        p=p.next;
        p.next=new ListNode(2);
        p=p.next;
        p.next=new ListNode(2);
        p=p.next;
        p.next=new ListNode(3);
        p=p.next;
        p.next=new ListNode(3);
        p=p.next;
        p.next=new ListNode(3);
        p=p.next;
        p.next=new ListNode(4);
        p=p.next;
        p.next=new ListNode(4);
        p=p.next;
        p.next=new ListNode(4);
        p=p.next;
        p.next=new ListNode(5);
        p=p.next;
        p.next=new ListNode(5);
        p=p.next;
        DeleteMultiple deleteMultiple = new DeleteMultiple();
        ListNode res = deleteMultiple.deleteDuplicates(head);
        while (res!=null)
        {
            System.out.print(res.val);
            res=res.next;
        }
    }
}