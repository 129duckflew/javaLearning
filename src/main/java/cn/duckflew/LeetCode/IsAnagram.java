package cn.duckflew.LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class IsAnagram
{
    public boolean isAnagram(String s, String t) {
        char[] array = s.toCharArray();
        char[] array1 = t.toCharArray();
        Arrays.sort(array);
        Arrays.sort(array1);
        return Arrays.equals(array,array1);
    }

    public static void main(String[] args)
    {
        IsAnagram isAnagram = new IsAnagram();
        isAnagram.isAnagram("anagram", "nagaram");
    }

}
