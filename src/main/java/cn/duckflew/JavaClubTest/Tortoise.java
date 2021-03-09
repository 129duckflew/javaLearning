package cn.duckflew.JavaClubPrepare;

import java.util.Random;

public class Tortoise implements Runnable
{
    @Override
    public void run()
    {
        int i=0;
        Random random=new Random(10);
        while (i<100)
        {
            i+=random.nextInt(10);
            System.out.println("乌龟跑了"+i+"了");
        }
        System.out.println("乌龟到达了终点!");
    }
}
