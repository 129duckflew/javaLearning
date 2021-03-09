package cn.duckflew;

import lombok.ToString;

import java.util.Arrays;
import java.util.Random;

public class ShellSort
{
    public static void adjustHeal(int[] arr,int index,int endIndex)
    {
        int adjustIndex=index;
        int max=adjustIndex*2+1;
        int temp;
        while (max<=endIndex)
        {
            if (max+1<=endIndex&&arr[max]<arr[max+1])//左孩子小于右孩子
            {
                max++;
            }
            if (arr[adjustIndex]>arr[max])
            {
                System.out.println("当前"+arr[adjustIndex]+"已经满足了 终止");
                break;
            }
            else
            {
                System.out.println("当前"+arr[adjustIndex]+"不满足  交换");
                temp=arr[adjustIndex];
                arr[adjustIndex]=arr[max];
                arr[max]=temp;
                System.out.println(Arrays.toString(arr));
            }
            /**
             * 更新 需要调整的节点的位置  以及孩子的位置  准备进入下一轮调整
             */
            adjustIndex=max;
            max=adjustIndex*2+1;
        }
    }
    public static void healSort(int [] arr)
    {
        for (int i = arr.length/2-1; i >=0 ; i--)
            adjustHeal(arr,i,arr.length-1);
        System.out.println("建堆完成后的数组: "+Arrays.toString(arr));
//        System.out.println("下面是整个过程:");
        int temp;
        for (int i = 1; i < arr.length; i++)
        {
//            System.out.println(Arrays.toString(arr));
            temp=arr[arr.length-i];
            arr[arr.length-i]=arr[0];
            arr[0]=temp;
            adjustHeal(arr,0,arr.length-i-1);
        }
    }
    public static void selectSort(int []arr)
    {
        int temp;
        int minIndex;
        for (int i = 0; i < arr.length-1; i++)
        {
             minIndex=i;
            for (int j = i+1; j < arr.length; j++)
            {

                if (arr[j]<arr[minIndex])
                {
                    minIndex = j;
                }
            }
            if (minIndex!=i)
            {
                temp=arr[minIndex];
                arr[minIndex]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void shellSort(int []arr)
    {
       int len=arr.length;
       int wanToInset;
       int j;
        for (int step=len/2; step >=1; step/=2)
        {
            System.out.println("分组间隔为 :"+step);
            for (int i = step; i < arr.length; i++)
            {
                wanToInset=arr[i];
                j=i-step;
                while (j>=0&&wanToInset<arr[j])
                {
                    arr[j+step]=arr[j];
                    j-=step;
                }
                arr[j+step]=wanToInset;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
    public static void insertSort(int [] arr)
    {
        int j;
        int wanToInsert;
        for (int i = 1; i < arr.length; i++)
        {
            wanToInsert=arr[i];
            j=i-1;
            while (j>=0&&wanToInsert<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=wanToInsert;
        }
    }
    public static void main(String[] args)
    {

        Random random = new Random();
        int []arr=new int[]
        {
                12,2,16,30,28,10,16,20,6,18
        };
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i]= random.nextInt(50);
//        }
        System.out.println("原数组:  ");
        System.out.println(Arrays.toString(arr));
        healSort(arr);
        System.out.print("排序后的数组: ");
        System.out.println(Arrays.toString(arr));
    }
}
