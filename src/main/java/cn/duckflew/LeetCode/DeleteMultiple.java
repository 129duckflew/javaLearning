package cn.duckflew.LeetCode;
public class DeleteMultiple
{
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null)return null;
        ListNode left=head;
        ListNode right=head;
        while (right!=null)
        {
//            ListNode check=head;
//            while (check!=null)
//            {
//                System.out.print(check.val+" ");
//                check=check.next;
//            }
//            System.out.println();
            if (left.val!=right.val)
            {
                left.next= right;
                left=left.next;
            }
            right=right.next;
        }
        left.next=null;
        return head;
    }
}
