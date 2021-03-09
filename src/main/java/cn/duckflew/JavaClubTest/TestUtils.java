package cn.duckflew.JavaClubTest;

import cn.duckflew.JavaShiyan.Utils;

import java.util.Arrays;

public class TestUtils
{
    public static void main(String[] args)
    {
        Utils<Integer> utils=new Utils<>();
        Integer [] arr =new Integer[]{4,1,3,2,5};
        System.out.println(Arrays.toString(arr));
        utils.reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
}
