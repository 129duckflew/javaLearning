package cn.duckflew.JavaClubTest;

import java.util.Arrays;
import java.util.Scanner;

public class LengthOfLastWord
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String next = scanner.nextLine();
        System.out.println(next);
        String[] words = next.split(" ");
        int length = words.length;
        if (length==0) System.out.println(0);
        else System.out.println(words[length-1].length());
        System.out.println(Arrays.toString(words));
    }
}
