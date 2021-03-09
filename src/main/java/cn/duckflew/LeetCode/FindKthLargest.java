package cn.duckflew.LeetCode;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.PriorityQueue;

public class FindKthLargest
{
    public void quickSort(int []arr,int left,int right)
    {
        if (arr==null||arr.length==0||left>right )return ;
        int key =arr[left];
        int l=left;
        int r=right;
        while (l!=r)
        {
            while (arr[r]>=key&&l<r)
                r--;
            while (arr[l]<=key&&l<r)
                l++;
            if (l<r)
            {
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
            }
        }
        arr[left]=arr[l];
        arr[l]=key;
        quickSort(arr,left,l-1);
        quickSort(arr,l+1,right);
    }
    public int  heapSort(int[] nums,int k)
    {
        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>((o1, o2) -> (o2-o1));
        for (int num : nums)
        {
            priorityQueue.add(num);
        }
        for (int i = 0; i < k-1; i++)
        {
            priorityQueue.poll();
        }
        return priorityQueue.poll();
    }
    public static void main(String[] args)
    {
        int [] array=new int[]{
                3,2,3,1,2,4,5,5,6
        };
        new FindKthLargest().heapSort(array,3);
        System.out.println(Arrays.toString(array));
    }
}
