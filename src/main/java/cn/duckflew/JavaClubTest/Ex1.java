package cn.duckflew.JavaClubTest;

import java.util.Scanner;

public class Ex1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入几个月");
        int month=sc.nextInt();
        System.out.println("第"+month+"个月,兔子的总数为:"+fun(month));
    }

    private static int fun(int month)
    {
        int couple=0;  //有多少对兔子
        for (int i=1;i<=month;i++)
        {
            if (i < 4)couple+=1;
            else couple+=i-2;
        }
        return 2*couple;
    }
}
