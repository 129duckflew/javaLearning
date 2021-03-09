package cn.duckflew.LanQiao;

import java.util.Arrays;

public class Three
{
    public  int three()
    {
        int [][]rect=new int[39][39];
        int curValue=1;
        int row=0;
        int col=0;
        int curLineValue=0;
        rect[row][col]=curValue++;
        while (rect[19][19]==0)
        {
            if (curLineValue % 2 == 0)
            {
                curLineValue++;
                col++;
                while (row+col==curLineValue&&row>=0&&col>=0)
                {
                    rect[row++][col--] = curValue++;
                }
                if (col<0)
                {
                    row--;
                    col++;
                }
            }
            else
            {
                curLineValue++;
                row++;
                while (row+col==curLineValue&&row>=0&&col>=0)
                {
                    rect[row--][col++] = curValue++;
                }
                if (row<0)
                {
                    col--;
                    row++;
                }
            }
        }
        for (int[] ints : rect)
        {
            String onelIne = Arrays.toString(ints);
            System.out.println(onelIne);
        }
        return  rect[19][19];
    }

    public static void main(String[] args)
    {
        int three = new Three().three();
        System.out.println(three);

    }
}
