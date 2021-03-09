package cn.duckflew.LeetCode;

import junit.framework.TestCase;
import org.junit.Test;

public class MinStackTest extends TestCase
{
    @Test
    public void testMinStack()
    {
        MinStack stack = new MinStack();
        stack.push(100);
        stack.push(88);
        stack.push(95);
        System.out.println(stack.getMin());
    }
}