package cn.duckflew.JavaShiyan;

import java.io.DataInputStream;
import java.net.ServerSocket; //服务端套接字
import java.net.Socket; //套接字

@SuppressWarnings("all")
public class Ex8_1S
{ //服务端
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss = new ServerSocket(7777); //设置服务器 的监听端口
        System.out.println("Server started.");
        while (true)
        { //始终监听
            //监听客户端请求
            Socket cs = ss.accept(); //可能产生阻塞（等待）的原因是没有客户端请求
            DataInputStream dis = new DataInputStream(cs.getInputStream());//
            System.out.println(dis.readUTF()); //输出来自客户端传送的信息
            dis.close();
            cs.close();
        }
    }
}

