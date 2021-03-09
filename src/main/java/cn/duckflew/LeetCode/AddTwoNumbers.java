package cn.duckflew.LeetCode;

import java.util.Stack;

public class AddTwoNumbers
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        ListNode head1=l1;
        ListNode head2=l2;
        while (head1!=null)
        {
            stack1.push(head1.val);
            head1=head1.next;
        }
        while (head2!=null)
        {
            stack2.push(head2.val);
            head2=head2.next;
        }
        ListNode head=null;
        int jinWei=0;
        while (!stack1.isEmpty()||!stack2.isEmpty()||jinWei!=0)
        {
            int sum=0;
            sum+=stack1.isEmpty()?0:stack1.pop();
            sum+=stack2.isEmpty()?0:stack2.pop();
            sum+=jinWei;
            ListNode newNode = new ListNode(sum % 10);
            newNode.next=head;
            head=newNode;
            jinWei=sum/10;
        }
        return head;
    }
}
