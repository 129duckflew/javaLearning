package cn.duckflew.JavaShiyan;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;

public class Ex8_2C
{
    public static void main(String[] args) throws Exception
    {
        byte[] buf = (new String("Hello")).getBytes();
        //定义数据报文包对象，包含了服务器地址及端口，InetSocketAddress继承抽象类SocketAddress
        DatagramPacket dp = new DatagramPacket(buf, buf.length, new InetSocketAddress("127.0.0.1", 5678));
        DatagramSocket ds = new DatagramSocket(8899); //创建对象
        ds.send(dp); //发送到指定的服务器端口
        ds.close();
    }
}

