package cn.duckflew.LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures
{
    public int[] dailyTemperatures(int[] T) {
        Stack<Integer> indexStack=new Stack<>();
        int []res=new int[T.length];
        for (int i = 0; i < T.length; i++)
        {
            if (indexStack.isEmpty()||T[indexStack.lastElement()]>=T[i])
            {
                indexStack.push(i);
                continue;
            }
            while (!indexStack.isEmpty()&&(T[indexStack.lastElement()]<T[i]))
            {
                Integer popIndex = indexStack.pop();
                res[popIndex]=i-popIndex;
            }
            indexStack.push(i);
        }
        while (!indexStack.isEmpty())
        {
            Integer popIndex = indexStack.pop();
            res[popIndex]=0;
        }
        return  res;
    }

    public static void main(String[] args)
    {
        DailyTemperatures haha = new DailyTemperatures();
        int[]  tem={73,74,75,71,69,72,76,73};
        int[] res = haha.dailyTemperatures(tem);
        System.out.println(Arrays.toString(res));
    }

}
