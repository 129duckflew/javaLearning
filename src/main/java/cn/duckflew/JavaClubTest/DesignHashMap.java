package cn.duckflew.JavaClubTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class DesignHashMap
{

    public static void main(String[] args)
    {
        Shop.put("football",120);
        Shop.put("basketball",100);
        Shop.put("volleyball",90);
        System.out.println("商品总数:"+Shop.size());
        System.out.println("其中football的价格为:"+Shop.getPrice("football"));
        System.out.println("所有商品-价格:");
        Shop.print_shop();
    }
}
class Shop
{
    private static HashMap<String,Integer> map;
    static
    {
        map=new HashMap<>();
    }

    public static void put(String name, int num)
    {
        map.put(name,num);
    }
    public static int size()
    {
        return map.size();
    }

    public static int getPrice(String produceName)
    {
        Integer integer = map.get(produceName);
        return integer==null?0:integer;
    }

    public static void print_shop()
    {
        Set<Map.Entry<String, Integer>> entries =   map.entrySet();
        for (Map.Entry<String, Integer> entry : entries)
        {
            System.out.println(entry.getKey()+"--"+entry.getValue());
        }
    }
}