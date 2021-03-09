package cn.duckflew.LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class NextGreaterElements
{
    public  int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack=new Stack<>();
        int[] res=new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
             while (!stack.isEmpty()&&nums[i]>nums[stack.lastElement()])
             {
                 int topIndex=stack.pop();
                 res[topIndex]=nums[i];
             }
             stack.push(i);
        }
        if (stack.isEmpty())return res;
        for (int i = 0; i < nums.length; i++)
        {
            while (!stack.isEmpty()&&nums[i]>nums[stack.lastElement()])
            {
                int topIndex=stack.pop();
                res[topIndex]=nums[i];
            }
        }
        while (!stack.isEmpty())
        {
            res[stack.pop()]=-1;
        }
        return res;
    }

    public static void main(String[] args)
    {
    }
}
