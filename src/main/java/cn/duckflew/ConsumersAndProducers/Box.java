package cn.duckflew.ConsumersAndProducers;

public class Box
{
    private int milk;
    private boolean statue;
    public synchronized void put(int milk)
    {
        if (statue)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        this.milk = milk;
        System.out.println("送奶工把第" + milk + "放入奶箱");
        statue=true;
        notifyAll();
    }
    public synchronized void get()
    {
        if (!statue)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        /**
         * 如果有牛奶  就消费
         */
        System.out.println("用户拿到第"+milk+"瓶奶");
        statue=false;
        notifyAll();
    }
}
