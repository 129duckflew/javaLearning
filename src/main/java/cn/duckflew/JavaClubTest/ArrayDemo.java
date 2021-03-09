package cn.duckflew.JavaClubPrepare;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArrayDemo
{
    public static void main(String[] args)
    {
        Integer [] arr={1,2,3,6,4,4};
        Arrays.sort(arr);
        System.out.println("顺序:");
        System.out.println(Arrays.toString(arr));
        System.out.println("逆序");
        //Arrays.sort(arr, (o1, o2) -> o2-o1);  下面这种写法与这一句等效
        Arrays.sort(arr, new Comparator<Integer>()
        {
            @Override
            public int compare(Integer o1, Integer o2)
            {
                return o2-o1;
            }
        });
        System.out.println(Arrays.toString(arr));

        int[] a={135446,654,6,4,654,65,46,45,6};
        ArrayList<Integer> integers = new ArrayList<>();
        
    }

}
