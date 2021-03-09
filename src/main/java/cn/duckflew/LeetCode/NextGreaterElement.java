package cn.duckflew.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElement
{
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int res[]=new int[nums1.length];
        Stack<Integer> stack=new Stack<>();
        Map<Integer,Integer> firstNumBigThanNum=new HashMap<>();
        for (int i = 0; i < nums2.length; i++)
        {
            int cur=nums2[i];
//                System.out.println("当前元素"+cur+" 栈顶元素"+stack.lastElement());
            while (!stack.isEmpty()&&stack.lastElement()<cur)
            {
//                    System.out.println(stack.lastElement()+"出栈");
                firstNumBigThanNum.put(stack.pop(),cur);
            }
            stack.push(cur);
//            System.out.println(cur+"入栈");
        }
//        while (!stack.isEmpty())
//        {
//            int pop=stack.pop();
//            firstNumBigThanNum.put(pop,-1);
//        }
        for (int i = 0; i < nums1.length; i++)
        {
            Integer get = firstNumBigThanNum.get(nums1[i]);
            res[i]=get!=null?get:-1;
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] res = nextGreaterElement(new int[]{4,1,2},new int[]{1,3,4,2});
        System.out.println(Arrays.toString(res));
    }
}
