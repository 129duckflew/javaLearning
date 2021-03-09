package cn.duckflew.JavaShiyan;

public class TestStation
{
    public static void main(String[] args)
    {
        System.out.println("being Selling");
        for (int i = 0; i < 4; i++)
        {
            Station station = new Station("window"+i);
            station.start();
        }
    }
}
