package cn.duckflew.LanQiao;

import java.util.Scanner;

public class Seven
{
    public  void seven()
    {
        Scanner scanner = new Scanner(System.in);
        String data=scanner.nextLine();
        int  []letterCnt=new int[26];
        for (int i = 0; i < 26; i++)
        {
            letterCnt[i]=0;
        }
        for (int i = 0; i < data.length(); i++)
        {
            char ch=data.charAt(i);
            letterCnt[ch-'a']++;
        }
        char mostCh=' ';
        int  maxNum=-1;
        for (int i = 0; i < 26; i++)
        {
            if (letterCnt[i]>maxNum)
            {
                maxNum=letterCnt[i];
                mostCh=(char)('a'+i);
            }
        }
        System.out.println(mostCh);
        System.out.println(maxNum);
    }
}
