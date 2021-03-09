package cn.duckflew.JavaShiyan;

import java.io.DataOutputStream; //数据输出字节流
import java.net.Socket;

public class Ex8_1C
{ //客户端
    public static void main(String[] args) throws Exception
    {
        // 第一个参数为服务器IP
        // 第二参数7777为服务器端口，与创建ServerSocket时使用的端口一致
        Socket s = new Socket("127.0.0.1", 7777); //创建客户端
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        dos.writeUTF("Hello Server!"); // 向服务器传送信息
        //System.out.println("客户端信息已发送。");
        Thread.sleep(5000); //休眠5秒
        dos.flush();
        dos.close(); // 超类方法
        s.close();
    }
}