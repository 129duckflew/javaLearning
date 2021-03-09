package cn.duckflew.LeetCode;

import junit.framework.TestCase;
import org.junit.Test;

public class AddTwoNumbersTest extends TestCase
{
    @Test
    public void testListNodeAdd()
    {
        ListNode node1=new ListNode(7);
        ListNode node2=new ListNode(2);
        node1.next=node2;
        ListNode node3=new ListNode(4);
        node2.next=node3;
        ListNode node4=new ListNode(3);
        node3.next=node4;
        ListNode node11 = new ListNode(5);
        ListNode node22 = new ListNode(6);
        ListNode node33 = new ListNode(4);
        node11.next=node22;
        node22.next=node33;
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode res = addTwoNumbers.addTwoNumbers(node1, node11);
        while (res!=null)
        {
            int val = res.val;
            res=res.next;
            System.out.print(val);
        }
    }
}