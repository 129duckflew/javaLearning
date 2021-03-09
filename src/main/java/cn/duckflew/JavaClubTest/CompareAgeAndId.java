package cn.duckflew.JavaClubTest;

import java.util.Comparator;

public class CompareAgeAndId implements Comparator
{
    @Override
    public int compare(Object o1, Object o2)
    {
        Person person1= (Person) o1;
        Person person2= (Person) o2;
        int age1=person1.getAge();
        int age2 = person2.getAge();
        if (age1!=age2)return age1-age2;
        else return person2.getId()-person1.getId();
    }
}
