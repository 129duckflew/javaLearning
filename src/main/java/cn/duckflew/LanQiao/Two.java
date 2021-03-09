package cn.duckflew.LanQiao;

public class Two
{
//    public static int two(int rect[][])
//    {
//        int res=0;
//        for (int i = 0; i < rect.length; i++)
//        {
//            for (int j = 0; j < rect[i].length-4; j++)
//            {
//                int pos=rect[i][j];
//                int pos1=rect[i][j+1];
//                int pos2=rect[i][j+2];
//                int pos3=rect[i][j+3];
//                if (pos==2&&pos1==0&&pos2==2&&pos3==0)
//                {
//                    res++;
//                }
//            }
//        }
//        for (int j = 0; j < rect[0].length; j++)
//        {
//            for (int i = 0; i < rect.length-4; i++)
//            {
//                int pos=rect[i][j];
//                int pos1=rect[i+1][j];
//                int pos2=rect[i+2][j];
//                int pos3=rect[i+3][j];
//                if (pos==2&&pos1==0&&pos2==2&&pos3==0)
//                {
//                    res++;
//                }
//            }
//        }
//        for (int i = 0; i < rect.length - 4; i++)
//        {
//            int row=i;
//            int col=0;
//            while (row+3<rect.length&&col+3<rect[i].length)
//            {
//                int pos=rect[row][col];
//                int pos1=rect[row+1][col+1];
//                int pos2=rect[row+2][col+1];
//                int pos3=rect[row+3][col+1];
//                if (pos==2&&pos1==0&&pos2==2&&pos3==0)
//                {
//                    res++;
//                }
//            }
//        }
//    }
    public int two(int[][]rect)
    {
        int res=0;
        for (int i = 0; i < rect.length; i++)
        {
            for (int j = 0; j < rect[i].length; j++)
            {
                /**
                 * 横着走
                 */
                if (j+3<rect[0].length)
                {
                    int pos=rect[i][j];
                    int pos1=rect[i][j+1];
                    int pos2=rect[i][j+2];
                    int pos3=rect[i][j+3];
                    if (pos==2&&pos1==0&&pos2==2&&pos3==0)
                    {
                        res++;
                    }
                }
                if (i+3<rect.length)
                {
                    int pos=rect[i][j];
                    int pos1=rect[i+1][j];
                    int pos2=rect[i+2][j];
                    int pos3=rect[i+3][j];
                    if (pos==2&&pos1==0&&pos2==2&&pos3==0)
                    {
                        res++;
                    }
                }
                if (i+3<rect.length&&j+3<rect[0].length)
                {
                    int pos=rect[i][j];
                    int pos1=rect[i+1][j+1];
                    int pos2=rect[i+2][j+2];
                    int pos3=rect[i+3][j+3];
                    if (pos==2&&pos1==0&&pos2==2&&pos3==0)
                    {
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int rect[][]=
                {
                        {2,2,0,0,0,0},
                        {0,0,0,0,0,0},
                        {0,0,2,2,0,2},
                        {0,0,0,0,0,0},
                        {0,0,0,0,2,2},
                        {0,0,2,0,2,0}
                };
        int two = new Two().two(rect);
        System.out.println(two);
    }
}
