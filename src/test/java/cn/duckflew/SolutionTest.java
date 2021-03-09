package cn.duckflew;

import cn.duckflew.LeetCode.Solution;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;

public class SolutionTest extends TestCase
{
    @Test
    public void testBS()
    {
//        int {}{}nums={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int [][]nums={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        for (int[] num : nums)
        {
            String s = Arrays.toString(num);
            System.out.println(s);
        }
        Solution solution = new Solution();
        boolean b = solution.searchMatrix(nums, 5);
        System.out.println(b);
    }
    @Test
    public void testEvalRPN()
    {
        Solution solution = new Solution();
        String[] tokens={"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
    }
}