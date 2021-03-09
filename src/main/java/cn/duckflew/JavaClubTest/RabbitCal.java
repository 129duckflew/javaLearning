package cn.duckflew.JavaClubTest;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
class Rabbit
{
    private int age;

    public Rabbit()
    {
        age=0;
    }
}
public class RabbitCal
{
    public static void main(String[] args)
    {
        for (int month=1;month<=24;month++)
        {
            Rabbit root = new Rabbit();
            List<Rabbit> rabbits=new ArrayList<>();
            rabbits.add(root);
            for (int i = 1; i <= month; i++)
            {
                for (int j = 0; j < rabbits.size(); j++)
                {
                    Rabbit rabbit = rabbits.get(j);
                    int age = rabbit.getAge();
                    if (age >= 4)
                    {
                        rabbits.add(new Rabbit());
                    }
                }
                for (int j = 0; j < rabbits.size(); j++)
                {
                    Rabbit rabbit = rabbits.get(j);
                    int age = rabbit.getAge();
                    rabbit.setAge(age + 1);
                }
            }
            System.out.print(rabbits.size());
            System.out.print(",");
        }
    }
}
