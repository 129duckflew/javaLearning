package cn.duckflew.JavaShiyan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection; //
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex8_5
{
    static
    { //静态代码块
        InetAddress inetAddress;
        try
        {
            //www前不可加http://
            //inetAddress = InetAddress.getByName("www.sun.com");
            inetAddress = InetAddress.getByName("www.wustwzx.com");
            System.out.println("主机域名：" + inetAddress.getHostName());
            System.out.println("主机IP：" + inetAddress.getHostAddress());
        } catch (UnknownHostException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args)
    {
        BufferedReader bufferedReader = null;
        try
        {
            URL url = new URL("http://www.wustwzx.com");
            URLConnection urlConnection = url.openConnection(); //获得对象
            // 获取Web Server返回的HTTP响应首部
            Map<String, List<String>> headers = urlConnection.getHeaderFields();
            //使用内部接口Map.Entry遍历Set集合
            Set<Map.Entry<String, List<String>>> entrySet = headers.entrySet();
            for (Map.Entry<String, List<String>> entry : entrySet)
            { //还可以使用iterator遍历
                String headerName = entry.getKey();
                System.out.println("Header Name:" + headerName);
                List<String> headerValues = entry.getValue(); //键值为List<String>类型
                for (String value : headerValues)
                {
                    System.out.print("Header value:" + value);
                }
                System.out.println();
            }
            // 获取HTTP响应的Body
            InputStream inputStream = urlConnection.getInputStream(); //
            //教学网站http://www.wustwzx.com主页文档编码使用GBK
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, Charset.forName("gbk")));//
            String line = bufferedReader.readLine();
            while (line != null)
            {
                System.out.println(line);
                line = bufferedReader.readLine();
            }
        } catch (MalformedURLException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            try
            {
                if (bufferedReader != null)
                {
                    bufferedReader.close();
                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}