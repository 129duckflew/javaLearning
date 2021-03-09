package cn.duckflew.LeetCode;

import junit.framework.TestCase;
import org.junit.Test;

import javax.xml.soap.Node;

public class GetInterSectionNodeTest extends TestCase
{
    @Test
    public void testGetInterListNode()
    {
        int []arrayA={4,1,8,4,5};
        int []arrayB={5,0,1,8,4,5};
        ListNode heada = new ListNode(4);
        ListNode headb = new ListNode(5);
        ListNode p1=heada;
        ListNode p2=headb;
        for (int i = 1; i < arrayA.length; i++)
        {
            p1.next=new ListNode(arrayA[i]);
            p1=p1.next;
        }
        for (int i = 1; i < arrayB.length; i++)
        {
            p2.next=new ListNode(arrayB[i]);
            p2=p2.next;
        }
        System.out.println();
        GetInterSectionNode getInterSectionNode = new GetInterSectionNode();
        ListNode intersectionNode = getInterSectionNode.getIntersectionNode(heada, headb);
        System.out.println(intersectionNode.val);
    }
    @Test
    public void testReverseList()
    {
        int []arrayA={1,2,3,4,5};
        ListNode heada = new ListNode(1);
        ListNode p1=heada;
        for (int i = 1; i < arrayA.length; i++)
        {
            p1.next=new ListNode(arrayA[i]);
            p1=p1.next;
        }
        ListReverse listReverse = new ListReverse();
        ListNode reverseList = listReverse.reverseList(heada);
        while (reverseList!=null)
        {
            System.out.println(reverseList.val);
            reverseList=reverseList.next;
        }
    }
    @Test
    public void testMergeList()
    {
        int []arrayA={1,2,4};
        ListNode headA = new ListNode(1);
        ListNode p1=headA;
        for (int i = 1; i < arrayA.length; i++)
        {
            p1.next=new ListNode(arrayA[i]);
            p1=p1.next;
        }
        int []arrayB={1,3,4};
        ListNode headB = new ListNode(1);
        ListNode p2=headB;
        for (int i = 1; i < arrayB.length; i++)
        {
            p2.next=new ListNode(arrayB[i]);
            p2=p2.next;
        }
        LIstMerge lIstMerge = new LIstMerge();
        ListNode res = lIstMerge.mergeTwoLists(headA, headB);
        while (res!=null)
        {
            System.out.println(res.val);
            res=res.next;
        }
    }
}