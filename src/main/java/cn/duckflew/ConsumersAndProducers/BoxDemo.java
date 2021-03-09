package cn.duckflew.ConsumersAndProducers;

public class  BoxDemo
{
    /**
     * 共享数据区域
     */
    public static void main(String[] args)
    {
        Box box = new Box();
        Producer producer = new Producer(box);
        Consumer consumer = new Consumer(box);
        Thread thread=new Thread(producer);
        Thread thread1 = new Thread(consumer);
        thread.start();
        thread1.start();
    }
}
