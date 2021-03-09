package cn.duckflew.LeetCode;

import junit.framework.TestCase;
import org.junit.Test;

public class SplitListToPartsTest extends TestCase
{

    @Test
    public void testSplitListToParts()
    {
        int array[]={1,2,3,4,5,6,7,8,9,10};
        ListNode head = new ListNode(array[0]);
        ListNode p=head;
        for (int i = 1; i < array.length; i++)
        {
            ListNode newNode = new ListNode(array[i]);
            p.next=newNode;
            p=p.next;
        }
        SplitListToParts toParts = new SplitListToParts();
        ListNode[] listNodes = toParts.splitListToParts(head, 20);
        for (ListNode HeadOnRes : listNodes)
        {
            ListNode p1=HeadOnRes;
            while (p1!=null)
            {
                System.out.print(p1.val+"  ");
                p1=p1.next;
            }
            System.out.println();
        }

    }
}