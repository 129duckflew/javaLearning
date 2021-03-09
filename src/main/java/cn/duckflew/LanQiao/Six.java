package cn.duckflew.LanQiao;

import java.util.Scanner;

public class Six
{
    public  void six()
    {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;
        int maxScore=Integer.MIN_VALUE;
        int minScore=Integer.MAX_VALUE;
        for (int i = 0; i < n; i++)
        {
            int score=scanner.nextInt();
            sum+=score;
            maxScore=Math.max(maxScore,score);
            minScore=Math.min(minScore,score);
        }
        System.out.println(maxScore);
        System.out.println(minScore);
        double aver=(sum/(n*1.0));
        System.out.println(String.format("%.2f",aver));
    }
}
