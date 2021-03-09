package cn.duckflew.LeetCode;

public class LongestPalindrome
{
    public static int longestPalindrome(String s) {
      int [] cnt=new int['z'-'A'+1];
        for (int i = 0; i < s.length(); i++)
            cnt[s.charAt(i)-'A']++;
        boolean hasSelectedCenter=false;
        int ans=0;
        for (int i = 0; i < cnt.length; i++)
        {
            if (cnt[i]%2==0)ans+=cnt[i];
            else
            {
                if (!hasSelectedCenter)
                {
                    ans+=cnt[i];
                    hasSelectedCenter=true;
                }
                else
                    ans+=cnt[i]-1;
            }
        }
      return ans;
    }

    public static void main(String[] args)
    {
        System.out.println(longestPalindrome("AAAAAA"));
    }
}
