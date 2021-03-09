package cn.duckflew.JavaClubPrepare;

import java.util.Random;

public class Rabbit implements Runnable
{
    @Override
    public void run()
    {
        int i=0;
        Random random=new Random(10);
        while (i<100)
        {
            i+=random.nextInt(10);
            System.out.println("兔子跑了"+i+"了");
        }
        System.out.println("兔子到达了终点!");
    }
}
