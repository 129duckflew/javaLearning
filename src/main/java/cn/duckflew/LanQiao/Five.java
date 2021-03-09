package cn.duckflew.LanQiao;

public class Five
{

    public static String five()
    {
        StringBuilder sb=new StringBuilder();
        for (int i = 14; i >= 0; i--)
        {
            sb.append((char)('a'+i));
        }
        System.out.println(sb.toString());
        int ans=0;
        for (int i = 0; i < sb.length()-1; i++)
        {
            for (int j = i+1; j < sb.length(); j++)
            {
                char a=sb.charAt(i);
                char b=sb.charAt(j);
                if (a>b)
                {
                    sb.setCharAt(i, b);
                    sb.setCharAt(j, a);
                    ans++;
                }
            }
        }
        System.out.println(sb.toString());
        System.out.println(ans);
        return sb.toString();
    }
}
