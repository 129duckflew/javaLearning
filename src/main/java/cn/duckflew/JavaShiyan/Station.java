package cn.duckflew.JavaShiyan;

public class Station extends  Thread
{
    public static int ticketNum=10;
    private Object lock;

    public Station(String windowName)
    {
        lock=new Object();
        this.setName(windowName);
    }

    @Override
    public void run()
    {
            while (ticketNum>0)
            {
                synchronized (lock)
                {
                    System.out.println(this.getName() + "正在出售第" + (10 - ticketNum-- + 1) + "张票");
                    try
                    {
                        Thread.sleep(3000);
                    } catch (InterruptedException e)
                    {
                        e.printStackTrace();
                    }
                }
            }
    }
}
