package cn.duckflew.LanQiao;

public class Four
{
     private int resOfFour=0;
     private int tube[][]=
            {
                    {1 , 1 , 0 , 0 , 0 , 1 , 0},
                    {1 , 1 , 0 , 0 , 0 , 0 , 1},
                    {0 , 0 , 1 , 1 , 0 , 0 , 1},
                    {0 , 0 , 0 , 1 , 1 , 0 , 1},
                    {0 , 0 , 0 , 1 , 1 , 0 , 1},
                    {1 , 0 , 0 , 0 , 0 , 1 , 1},
                    {0 , 0 , 1 , 0 , 1 , 0 , 1}
            };
    public  boolean hasVisited[]=new boolean[6];
    public  int four()
    {
        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                hasVisited[j]=false;
            }
            dfs(i);
        }
        return resOfFour;
    }
    public  void  dfs(int index)
    {
        for (int i = 0; i < 6; i++)
        {
            if (tube[index][i]==1&&!hasVisited[i])
            {
                dfs(i);
                resOfFour++;
                hasVisited[i]=true;
            }
        }
    }
}
