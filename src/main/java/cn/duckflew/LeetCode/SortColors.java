package cn.duckflew.LeetCode;

import java.io.File;
import java.util.Arrays;

public class SortColors
{
    public static void sortColors(int[] nums)
    {
        int zeroLastIndex=0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i]==0)
            {
                nums[i]=nums[zeroLastIndex];
                nums[zeroLastIndex++]=0;
            }
        }
        int oneLastIndex=zeroLastIndex;
        for (int i = zeroLastIndex; i < nums.length; i++)
        {
            if (nums[i]==1)
            {
                nums[i]=nums[oneLastIndex];
                nums[oneLastIndex++]=1;
            }
        }
    }
    public static void delete()
    {
        String location="F:\\谷歌下载";
        File dir=new File(location);
        File[] files = dir.listFiles();
        for (File file : files)
        {
            if (file.length()>20000&&file.getName().contains(".torrent"))
            {
                System.out.println(file.getName());
                file.delete();
            }
        }
    }
    public static void main(String[] args)
    {
        delete();
//        int []arr=new int[]{
//                2,0,2,1,1,0
//        };
//        sortColors(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
