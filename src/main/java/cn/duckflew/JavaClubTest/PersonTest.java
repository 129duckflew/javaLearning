package cn.duckflew.JavaClubTest;

import java.util.*;

public class PersonTest
{
    public static void main(String[] args)
    {
        List<Person> list=new ArrayList<>();
        list.add(new Person(1003,"张三",18));
        list.add(new Person(1008,"李四",21));
        list.add(new Person(1015,"王五",18));
        list.add(new Person(1001,"赵六",20));
        Collections.sort(list,new CompareAgeAndId());
        for (Person person : list)
        {
            System.out.println(person);
        }
    }
}
