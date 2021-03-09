package cn.duckflew.JavaClubPrepare;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class StudentComTest
{
    public static void main(String[] args)
    {
        Student heMeiLun = new Student();
        heMeiLun.setScore(99);
        heMeiLun.setName("heMeiLun");
        heMeiLun.setStuNo("201913137156");


        Student liLiang = new Student();
        liLiang.setScore(99);
        liLiang.setName("liLiang");
        liLiang.setStuNo("201913137156");


        Student huangRongHua= new Student();
        huangRongHua.setScore(64);
        huangRongHua.setName("huangRongHua");
        huangRongHua.setStuNo("201913137159");

        Student[] students={liLiang,heMeiLun,huangRongHua};
        Arrays.sort(students, new Comparator<Student>()
        {
            @Override
            public int compare(Student o1, Student o2)
            {
                if (o1.getScore()!=o2.getScore())
                {
                    return o2.getScore()-o1.getScore();
                }
                else
                {
                    if (o1.getStuNo()!=o2.getStuNo())return o1.getStuNo().compareTo(o2.getStuNo());
                    else return o1.getName().compareTo(o2.getName());
                }
            }
        });

        System.out.println(Arrays.toString(students));
    }
}
