package cn.duckflew.JavaShiyan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Ex8_2S
{
    @SuppressWarnings("resource")
    public static void main(String[] args) throws Exception
    {
        byte buf[] = new byte[1024];
        //设置数据报文包
        DatagramPacket dp = new DatagramPacket(buf, buf.length);
        //创建报文接收端口，在客户端程序会使用该端口号
        DatagramSocket ds = new DatagramSocket(5678);
        System.out.println("Server started.");
        while (true)
        {
            ds.receive(dp); //阻塞式的接收
            System.out.println(new String(buf, 0, dp.getLength()) + ",Server!");
        }
    }
}
