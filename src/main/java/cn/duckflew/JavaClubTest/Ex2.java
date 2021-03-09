package cn.duckflew.JavaClubTest;

 class Point
{
    public int x;
    public   int y;

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public Point()
    {
        x=0;
        y=0;
    }
    public void movePoint(int dx,int dy)
    {
        x+=dx;
        y+=dy;
    }
}
public class Ex2
{
    public static void main(String[] args)
    {
        Point p1 = new Point(2, 2);
        p1.movePoint(6,7);
        System.out.println("p1 当前的X坐标为 : "+p1.x+",p1 当前的Y坐标为: "+p1.y);
        Point p2 = new Point();
        p2.movePoint(6,7);
        System.out.println("p2 当前的X坐标为 : "+p2.x+",p1 当前的Y坐标为: "+p2.y);
    }
}
