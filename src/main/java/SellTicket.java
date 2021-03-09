import lombok.SneakyThrows;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SellTicket implements Runnable
{
    private int ticketNum=100;
    private Lock lock=new ReentrantLock();
    public SellTicket()
    {
    }

    @SneakyThrows
    @Override
    public void run()
    {
        while (true)
        {
            try
            {
                lock.lock();
                if (ticketNum > 0)
                {
                    System.out.println(Thread.currentThread().getName() + "正在售出 第" + ticketNum + "张票");
                    Thread.sleep(100);
                    ticketNum--;
                } else
                {
                    System.out.println("票售完");
                }
            }
            finally
            {
                lock.unlock();
            }

        }
    }
}
