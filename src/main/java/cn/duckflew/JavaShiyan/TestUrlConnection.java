package cn.duckflew.JavaShiyan;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestUrlConnection
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress inetAddress=InetAddress.getByName("www.duckflew.cn");
            System.out.println("主机域名"+inetAddress.getHostAddress());
            System.out.println("主机IP:"+inetAddress.getHostAddress());
            URL url=new URL("https://duckflew.cn");
            //获取urlConnection
            URLConnection urlConnection=url.openConnection();
            Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
            System.out.println("响应头:");
            Set<String> keySet = headerFields.keySet();
            for (String headerKey : keySet)
            {
                System.out.println(headerFields.get(headerKey));
            }
            //获取http响应体
            System.out.println("响应体");
            InputStream inputStream = urlConnection.getInputStream();
            BufferedReader bf=new BufferedReader(new InputStreamReader(inputStream, Charset.forName("GBK")));
            String line=null;
            while ((line=bf.readLine())!=null)
            {
                System.out.println(line);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
