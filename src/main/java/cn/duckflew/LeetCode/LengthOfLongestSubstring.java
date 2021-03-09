package cn.duckflew.LeetCode;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubstring
{
    public static int lengthOfLongestSubstring(String s) {
        if (s==null||s.length() == 0)return 0;
        Map<Character,Integer>map=new HashMap<>();
        int maxLength=Integer.MIN_VALUE;
        int curHeadIndex=0;
        for (int i = 0; i < s.length(); i++)
        {
            Character ch=s.charAt(i);
            if (map.get(ch) != null)
            {
                if (map.get(ch)+1>curHeadIndex)
                curHeadIndex = map.get(ch) + 1;
            }
            map.put(ch,i);
            maxLength=Math.max(maxLength,i-curHeadIndex+1);
        }
        return maxLength;
    }

    public static void main(String[] args)
    {
        String data="abba";
        System.out.println(lengthOfLongestSubstring(data));
    }
}
