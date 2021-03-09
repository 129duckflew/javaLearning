package cn.duckflew.LanQiao;

public class One
{
    public  int one()
    {
        int ans=0;
        for (int i = 1; i <=2020 ; i++)
        {
            String cur=String.valueOf(i);
            for (int j = 0; j < cur.length(); j++)
            {
                if (cur.charAt(j)=='2')ans++;
            }
        }
        return ans;
    }
}
