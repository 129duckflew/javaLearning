package cn.duckflew.JavaClubTest;

public class PrimeProblem
{
    public static boolean isPrime(int x)
    {
        if (x==1)return false;
        for (int i = 2; i <= Math.sqrt(x); i++)
        {
            if (x%i==0)return  false;
        }
        return true;
    }

    public static void main(String[] args)
    {
        int sum=0;
        for (int i = 101; i <=200 ; i++)
        {
            if (isPrime(i))
            {
                sum++;
                System.out.print(i);
                System.out.print(" ");
            }
        }
        System.out.println();
        System.out.println(sum);
    }
}
