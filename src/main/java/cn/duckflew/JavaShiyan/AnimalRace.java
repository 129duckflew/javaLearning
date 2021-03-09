package cn.duckflew.JavaShiyan;

class Animal implements Runnable
{
    private String name;
    private int speed; // 速度
    private int distance; // 距离
    private int sumdistance = 0; // 已跑距离

    public Animal(String name, int speed, int distance)
    {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    @Override
    public void run()
    {
        while (sumdistance < distance)
        {
            try
            {
                // 休眠毫秒数是随机的（在500至1500之间）
                Thread.sleep((int) (Math.random() * 1000) + 500);
            } catch (Exception e)
            {
                System.out.println(e);
            }
            sumdistance += speed; // 获得当前跑了多长距离
            //sumdistance += Math.random() * speed;
            System.out.println(name + " : 我已经跑了 " + sumdistance);
        }
        System.out.println(name + " 终于冲过终点了 ! "); // 执行本语句后线程结束
    }
}

public class AnimalRace
{
    public static void main(String[] args)
    {
        Animal rabbit = new Animal("兔子", 20, 50);
        Animal turtle = new Animal("乌龟", 15, 50);
        new Thread(rabbit).start();
        new Thread(turtle).start();
    }
}