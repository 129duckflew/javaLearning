package cn.duckflew.JavaShiyan;

public class SaleTicket2
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        TicketWindow2 tw = new TicketWindow2(); //创建售票窗口对象
        new Thread(tw).start();
        ; //创建并启动线程对象
        new Thread(tw).start();
        ;
        new Thread(tw).start();
        ;
    }
}

class TicketWindow2 implements Runnable
{
    private int nums = 10;

    @Override
    public void run()
    {
        while (true)
        {
            synchronized (this)
            { //增加代码块同步锁解决并发问题
                if (nums > 0)
                {
                    System.out.println("正在由窗口" + Thread.currentThread().getName() + "售出第 " + nums-- + "张票");
 /*try {
 Thread.sleep(100); //设置线程休眠
 } catch (Exception e) {
 // TODO: handle exception
 }*/
                } else break;
            }
        }
    }
}