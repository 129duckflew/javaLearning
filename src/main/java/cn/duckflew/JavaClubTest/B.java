package cn.duckflew.JavaClubTest;
import lombok.ToString;

@ToString
class A
{
    public String s="A";

    public String getS()
    {
        return s;
    }

    public void setS(String s)
    {
        this.s = s;
    }
}
@ToString
public class B extends A
{
    public String s="B";

    @Override
    public String getS()
    {
        return s;
    }

    @Override
    public void setS(String s)
    {
        this.s = s;
    }

    public static void main(String[] args)
    {
        A a = new A();
        B b = new B();
        System.out.println(a.s);
        System.out.println(b.s);
        a.setS("[AA]");
        b.setS("[BB]");
        a=b;
        System.out.println(a.s);
        System.out.println(b.s);
        System.out.println(a.getS());
        System.out.println(b.getS());
    }
}
