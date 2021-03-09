package cn.duckflew.JavaShiyan;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class ArrayAndList {
    public static void main(String[] args) {
        // 创建一个只能插入String类型元素的List对象
        List<String> names = new ArrayList<String>(); //List集合不必指定大小
        names.add("张三");
        System.out.println(names.get(0)); //获取
        // 下一行代码无法编译通过，使用泛型后编译器将进行类型检查
        //names.add(new Integer(4)); // 只能添加String类型的对象
        System.out.println("-----------------");
        List list = new ArrayList(); //未使用泛型，类型不安全
        list.add("测试");
        list.add(20); //List集合长度可变
        System.out.println(list.get(0)); //获取List集合元素，使用方法get()
        System.out.println(list.get(1));
        Object[] array = list.toArray(); //List集合转数组
        System.out.println("对应的Object[]数组："+Arrays.toString(array)); //调用类Arrays输出数组全部元素
        System.out.println("输出数组的第一个元素："+array[0]); //使用[]和下标
        System.out.println("数组array不能再添加元素，但List集合可以");
        list.add(30);System.out.println("List集合又添加了一个元素");
        System.out.println("集合长度："+list.size());
        System.out.println("数组长度："+array.length);
    }
}