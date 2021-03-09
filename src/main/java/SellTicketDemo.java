public class SellTicketDemo
{
    public static void main(String[] args)
    {
        SellTicket sellTicket=new SellTicket();
        Thread t=new Thread(sellTicket,"窗口1");
        Thread t1=new Thread(sellTicket,"窗口2");
        Thread t2=new Thread(sellTicket,"窗口3");
        t.start();
        t1.start();
        t2.start();
    }
}
