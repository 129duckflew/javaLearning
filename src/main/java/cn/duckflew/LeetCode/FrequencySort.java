package cn.duckflew.LeetCode;

import javax.sound.midi.Soundbank;
import java.util.*;


public class FrequencySort
{
    public static String frequencySort(String s) {
        int [] times=new int[200];
        PriorityQueue<int[]>queue=new PriorityQueue<>((o1, o2) -> o2[1]-o1[1]);
        for (int i = 0; i < s.length(); i++)
        {
            times[s.charAt(i)]++;
        }
        for (int i = 0; i < 200; i++)
        {
            if (times[i]!=0)
            {
                queue.add(new int[]{i, times[i]});
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        while (!queue.isEmpty())
        {
            int [] cur= queue.poll();
            for (int i = 0; i < cur[1]; i++)
            {
                stringBuilder.append((char)(cur[0]));
            }

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args)
    {
        String s="tree";
        String s1 = frequencySort(s);
        System.out.println(s1);
    }
}
