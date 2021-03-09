package cn.duckflew.JavaClubPrepare;

public class InnerClassTest
{
    public static void main(String[] args)
    {
        InnerClass innerClass = new InnerClass();
        InnerClass.Inner inner=innerClass.new Inner();
    }
}
