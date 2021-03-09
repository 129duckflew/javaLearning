package cn.duckflew.LeetCode;

import java.util.*;

public class WordPattern
{
    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        if (pattern.length()!=strings.length)return false;
        Map<Character,String> map=new HashMap<>();
        for (int i = 0; i < pattern.length(); i++)
        {
            char ch = pattern.charAt(i);
            String firstValue=map.get(ch);
            if (firstValue!=null)
            {
                if (!strings[i].equals(map.get(ch)))return false;
            }
            else
            {
                if (map.containsValue(strings[i]))return false;
                else map.put(ch,strings[i]);
            }
        }
        return true;
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
           Integer count=map.get(nums[i]);
           if (count==null)map.put(nums[i],1);
           else map.put(nums[i],count+1);
        }
        PriorityQueue<int[]> queue=new PriorityQueue<>((o1, o2) -> o1[1]-o2[1]);
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : entries)
//        {
//            Integer num = entry.getKey();
//            Integer count = entry.getValue();
//            System.out.println(" "+num+" "+count);
//        }
        for (Map.Entry<Integer, Integer> entry : entries)
        {
            Integer num = entry.getKey();
            Integer count = entry.getValue();
            if (queue.size()==k)
            {
                if (count>queue.peek()[1])
                {
                    queue.poll();
                    queue.add(new int[]{num,count});
                }
            }
            else
            {
                queue.add(new int[]{num, count});
            }
        }
        int[] res = new int[k];
        int cnt=0;
        while (queue.size()>0)
        {
            res[cnt++]=queue.poll()[0];
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] res = new WordPattern().topKFrequent(new int[]{4, 1, -1, 2, -1, 2, 3}, 2);
        System.out.println(Arrays.toString(res));
    }
}
