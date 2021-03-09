package cn.duckflew.JavaClubTest;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee
{
    private int id;
    private String name;
    private double salary;

    @Override
    public String toString()
    {
        return id+"---"+name+"---"+salary;
    }
}
