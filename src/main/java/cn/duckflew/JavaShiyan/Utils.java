package cn.duckflew.JavaShiyan;

public class Utils <T>
{
    public void reverse(T[] arr)
    {
        int len = arr.length;
        for (int i = 0; i < len/2; i++)
        {
            T temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }
    }
}
