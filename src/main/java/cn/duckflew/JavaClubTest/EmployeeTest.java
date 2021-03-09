package cn.duckflew.JavaClubTest;

import java.util.ArrayList;
import java.util.List;

public class EmployeeTest
{
    public static void main(String[] args)
    {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(1,"张三",5000));
        employees.add(        new Employee(2,"李四",5800));
        employees.add(        new Employee(3,"王五",5500));
        for (Employee employee : employees)
        {
            System.out.println(employee);
        }
    }
}
