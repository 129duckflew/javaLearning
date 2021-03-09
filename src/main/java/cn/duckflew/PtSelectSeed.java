package cn.duckflew;

import java.io.File;

public class PtSelectSeed
{
    public static void selectSeed(String dirPath,int maxLength)
    {
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        for (File file : files)
        {
            if (file.getName().contains(".torrent")&&file.length()>maxLength)
            {
                System.out.println("delete:"+file.getName());
                file.delete();
            }
        }
    }

    public static void main(String[] args)
    {
        selectSeed("F:\\谷歌下载",8192);
    }
}
