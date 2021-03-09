package cn.duckflew.JavaClubTest;

import java.io.*;

public class FileCopy
{
    public static void main(String[] args)
    {
        String srcFile="F:\\图片\\鬼刀\\以前收集\\2k\\1.jpg";
        String targetFile="F:\\图片\\鬼刀\\以前收集\\1_copy.jpg";
        System.out.println("begin copy"     );
        copyFile(srcFile,targetFile);
        System.out.println("copy Finished");
    }

    private static void copyFile(String srcFile, String targetFile)
    {
        File sFile= new File(srcFile);
        File tFile = new File(targetFile);
        FileInputStream fis= null;
        FileOutputStream fos=null;
        try
        {
            fis = new FileInputStream(sFile);
             fos=new FileOutputStream(tFile);
            byte [] buf=new byte[1024];
            int len;
            while ((len=fis.read(buf))>0)
            {
                fos.write(buf,0,len);
            }
        } catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            try
            {
                assert fis != null;
                fis.close();
                assert fos != null;
                fos.close();
            } catch (IOException e)
            {
                e.printStackTrace();
            }
        }
    }
}
