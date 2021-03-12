package cn.duckflew.LeetCode;

import com.sun.rowset.internal.Row;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import sun.security.util.Length;

import java.lang.reflect.Array;
import java.util.*;

public class Solution
{
    public int calcu(int a, int b, String op)
    {
        switch (op)
        {
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
            default:throw new IllegalArgumentException("操作符错误！");
        }
    }
    /**
     * 移动零
     * @param nums
     */
    public static void  moveZeroes(int[] nums)
    {
        if (nums==null||nums.length==0)return ;
        int i=0;
        int j=0;
        for (;i<nums.length;i++)
        {
            if (nums[i]!=0)
            {
                nums[j++]=nums[i];
            }
        }
        for (;j<nums.length;j++)
        {
            nums[j]=0;
        }
        System.out.print("[");
        for (int x=0;x<nums.length;x++)
        {
            System.out.print(nums[x]);
            if (x==nums.length-1) System.out.print("]");
            else System.out.print(",");
        }
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c)
    {
        /**
         * 矩阵重塑
         */
        int R=nums.length;
        int C=nums[0].length;
        if (r*c!=R*C)
        return nums;
        int[][] newNums = new int[r][c];
        int newRow=0;
        int newCol=0;
        for (int i=0;i<nums.length;i++)
        {
            for (int j=0;j<nums[i].length;j++)
            {
                newNums[newRow][newCol++]=nums[i][j];
                if (newCol==c)
                {
                    newCol=0;
                    newRow++;
                }
            }
        }
        return  newNums;
    }
    public static int  findMaxConsecutiveOnes(int[] nums)
    {
        int result=0;
        int hasExistZero=0;
        for (int i=0;i<nums.length;i++)
        {
            if (nums[i]==1)
            {
                hasExistZero++;
            }
            else
            {
                if (hasExistZero>result)result=hasExistZero;
                hasExistZero=0;
            }
        }
        if (hasExistZero>result)result=hasExistZero;
        return result;
    }
    public static int findShortestSubArray(int[] nums) {
        Map<Integer,Integer> left=new HashMap<>();
        Map<Integer,Integer>  right=new HashMap<>();
        Map<Integer,Integer>  counts=new HashMap<>();
        for (int i=0;i<nums.length;i++)
        {
            /**
             * int x = nums[i];
             if (left.get(x) == null) left.put(x, i);
             right.put(x, i);
             count.put(x, count.getOrDefault(x, 0) + 1);
             */
            int cur=nums[i];
            counts.put(cur,counts.getOrDefault(cur,0)+1);
            right.put(cur,i);
            if (left.get(cur)!=null)
            {
                Integer count = counts.get(cur);
                counts.put(cur,count+1);
            }
            else
            {
                left.put(cur,i);
                counts.put(cur,1);
            }
        }
        Integer maxCount = Collections.max(counts.values());
        int res=nums.length;
        for (Integer key:counts.keySet())
        {
            if (counts.get(key).equals(maxCount))
            {
                res=Math.min(res,right.get(key)-left.get(key)+1);
            }
        }
        return res;
    }
    public static int[] smallerNumbersThanCurrent(int[] nums)
    {
        int len=nums.length;
       Map<Integer, HashSet<Integer>>indexOfValues=new HashMap<>();
       int[] newNums = Arrays.copyOf(nums, len);
       Arrays.sort(newNums);
       for (int i=0;i<newNums.length;i++)
       {
           int cur=newNums[i];
           HashSet<Integer> indexSet = indexOfValues.getOrDefault(cur,new HashSet<>());
           indexSet.add(i);
           indexOfValues.put(cur,indexSet);
       }
       int[] res=new int[len];
       for (int i=0;i<len;i++)
       {
           int cur=nums[i];
           Integer min = Collections.min(indexOfValues.get(cur));
           res[i]=min;
       }
       return res;
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        Map<Integer,Integer> dataOfEveryLine=new HashMap<>();
        for (int j=0;j<matrix[0].length;j++)
        {
            dataOfEveryLine.put(j-0,matrix[0][j]);
        }
        for (int i=1;i<matrix.length;i++)
        {
            dataOfEveryLine.put(0-i,matrix[i][0]);
        }
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j]!=dataOfEveryLine.get(j-i))return false;
            }
        }
        return true;
    }
    public static int[] findErrorNums(int[] nums) {
        int repeatNum = 0;
        System.out.println(Arrays.toString(nums));
        for (int i=0;i<nums.length;i++)
        {
           int cur=nums[i];
           if (nums[Math.abs(cur)-1]>0)nums[Math.abs(cur)-1]*=-1;
           else
           {
               repeatNum=Math.abs(cur);
           }
            System.out.println(Arrays.toString(nums));
        }
        int missing = 0;
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i]>0)
            {
                missing=i+1;
            }
        }
        return new int[]{repeatNum,missing};
    }
    public int binarySearch(int []nums ,int target)
    {
        int low=0;
        int high=nums.length-1;
        int mid;
        while (low<=high)
        {
            mid=low+(high-low)/2;
            if (target==nums[mid])return mid;
            if (target>nums[mid])low=mid+1;
            if (target<nums[mid])high=mid-1;
        }
        return -1;
    }
    public  boolean searchMatrix(int[][] matrix, int target) {
        if (matrix==null||matrix.length==0||matrix[0].length==0)return false;
        int curCol=matrix[0].length-1;
        int curRow=0;
        int cur;
        while (curCol>=0&&curRow<matrix.length)
        {
            cur=matrix[curRow][curCol];
            if (cur==target)return true;
            else if (cur>target) curCol--;
            else curRow++;
        }
        return false;
    }
    /**
     *leetcode 64  dp经典问题
     */
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length][grid[0].length];
        for (int i = 0; i < grid.length; i++)
        {
            for (int j = 0; j < grid[0].length; j++)
            {
                if (i==0&&j==0)dp[i][j]=grid[i][j];
                else if (i==0) dp[i][j]=dp[i][j-1]+grid[i][j];
                else if (j==0) dp[i][j]=dp[i-1][j]+grid[i][j];
                else dp[i][j]=Math.min(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return  dp[grid.length-1][grid[0].length-1];
    }
    /**
     * dp问题  leetcode 120
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp=new ArrayList<>();
        for (int i = 0; i < triangle.size(); i++)
        {
            List<Integer> list=new ArrayList<>();
            dp.add(list);
        }
        for (int i = 0; i < triangle.size(); i++)
        {
            List<Integer> line=triangle.get(i);
            for (int j = 0; j < line.size(); j++)
            {
                int dpValue;
                if (i==0&&j==0)
                    dpValue=line.get(j);
                else if (j==0)
                    dpValue=dp.get(i-1).get(j)+line.get(j);
                else if (j==i)
                    dpValue=dp.get(i-1).get(j-1)+line.get(j);
                else dpValue=Math.min(dp.get(i-1).get(j),dp.get(i-1).get(j-1))+line.get(j);
                dp.get(i).add(dpValue);
            }
        }
        int minValue=0xfffffff;
        List<Integer>LowestLine=dp.get(triangle.size()-1);
        for (Integer integer : LowestLine)
        {
            if (integer<minValue)minValue=integer;
        }
        return minValue;
    }
    /**
     *  leetcode 70 爬楼梯  dp问题
     */
    public int climbStairs(int n) {
        if (n<3)return n;
        int []dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <=n; i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public  int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length+1];
        dp[0]=dp[1]=0;
        for (int i = 2; i <=cost.length; i++)
            dp[i]=Math.min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        return dp[cost.length];
    }
    public static int rob(int[] nums) {
        if (nums==null||nums.length==0)return 0;
        if (nums.length==1)return nums[0];
        int []dp=new int[nums.length];
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        for (int i = 2; i < dp.length; i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
        }
        return Math.max(dp[dp.length-1],dp[dp.length-2]);
    }

    /**
     * 最大子序列的和
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int res;
        int []dp=new int[nums.length];
        res=dp[0]=nums[0];
        for (int i = 1; i < nums.length ;i++)
        {
            dp[i]=Math.max(nums[i],dp[i-1]+nums[i]);
            if (dp[i]>res)res=dp[i];
        }
        return res;
    }

    /**
     * 416 分割等和子集  dp 0-1背包问题
     */
    public static boolean canPartition(int[] nums) {
        if (nums.length<2)return false;
        int Sum=0,maxNum=nums[0];
        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i]>maxNum)maxNum=nums[i];
            Sum+=nums[i];
        }
        if (Sum%2!=0)return false;
        int target=Sum/2;
        boolean  [][] dp=new boolean[nums.length][target+1];
        for (int i = 0; i < dp.length; i++)
        {
            if (nums[i]>target)return false;
            if (i==0)
            {
                dp[0][0]=true;
                dp[0][nums[i]]=true;
                continue;
            }
            for (int j = 0; j < dp[0].length ;j++)
            {
                if (j==0)
                {
                    dp[i][j] = true;
                }
                else
                {
                    if (nums[i]<j)dp[i][j]=dp[i-1][j]||dp[i-1][j-nums[i]];
                    else dp[i][j]=dp[i-1][j];
                }
                if (dp[nums.length-1][target])return true;
            }
        }
        return dp[nums.length-1][target];
   }
    public int coinChange(int[] coins, int amount) {
        int[] dp=new int[amount+1];
        dp[0]=0;
        Arrays.sort(coins);
        for (int i = 1; i < amount + 1; i++)
        {
            dp[i]=Integer.MAX_VALUE;
        }
        for (int i = 1; i <amount+1 ; i++)
        {
            for (int j = 0; j < coins.length; j++)
            {
                if (i<coins[j])break;
                dp[i]=Math.min(dp[i-coins[j]]+1,dp[i]);
            }
        }System.out.println(Arrays.toString(dp));
        if (dp[amount]!=Integer.MAX_VALUE)
        return dp[amount];
        else return -1;
    }
    public int uniquePaths(int m, int n) {
        int [][]dp=new int[m][n];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < n; j++)
            {
                if (i==0||j==0)dp[i][j]=1;
                else dp[i][j]=dp[i-1][j]+dp[i][j-1];
            }
        }
        return dp[m-1][n-1];
    }
    public int numRollsToTarget(int d, int f, int target) {
        int[][] dp = new int[d + 1][target+1];
        for (int i = 1; i < d + 1; i++)
        {
            for (int j = 1; j <=target; j++)
            {
                if (i==1)
                {
                    if (j<=f)
                    dp[i][j] = 1;
                    else dp[i][j]=0;
                }
                else 
                {
                    for (int k = 1; k <= f; k++)
                    {
                        if (j>k)
                        dp[i][j]=(dp[i][j]+dp[i-1][j-k])%(10^9 + 7);
                    }
                }
            }
        }
        return dp[d][target];
    }

    /**
     * 718  求最长的重复子数组
     */
    public int findLength(int[] A, int[] B) {
        int lenA=A.length;
        int lenB=B.length;
        int[][]dp=new int[lenA][lenB];
        int maxLength=0;

        for (int i = 0; i < lenA; i++)
        {
            for (int j = 0; j < lenB; j++)
            {
                if (i==0&&j==0)
                {
                    if (A[0]==B[0])
                    {
                        dp[0][0] = 1;
                        maxLength=dp[0][0];
                    }
                    else
                        dp[0][0] = 0;
                }
                else if (i==0||j==0)
                {
                    if (A[i]==B[j])
                    {
                        dp[i][j] = 1;
                        maxLength=Math.max(dp[i][j],maxLength);
                    }
                    else dp[i][j]=0;
                }
                else if (A[i]==B[j])
                {

                    dp[i][j] = dp[i-1][j-1] + 1;
                    if (dp[i][j]>maxLength)maxLength=dp[i][j];

                }
                else if (A[i]!=B[j]) dp[i][j]=0;
            }
        }
//        for (int[] ints : dp)
//        {
//            System.out.println(Arrays.toString(ints));
//        }
//        System.out.println(dp[1][2]);
        return maxLength;
    }

    /**
     * 300 最长递增子序列
     */

    public int lengthOfLIS(int[] nums) {
        int []dp=new int[nums.length];
        dp[0]=1;
        for (int i = 1; i < nums.length; i++)
        {
            int cur=0;//找出从0-i-1最大的dp值 并且要满足numsj<numsi
            for (int j = 0; j < i; j++)
            {
                if (nums[j]<nums[i])cur=Math.max(cur,dp[j]+1);
            }
            dp[i]=cur==0?1:cur;
        }
        int res=0;
        for (int i = 0; i < nums.length; i++)
        {
            if (dp[i]>res)res=dp[i];
        }
        return res;
    }

    /**
     * 5. 最长回文字符串
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        boolean[][] dp=new boolean[s.length()][s.length()  ];
        int maxi=0;
        int maxj=0;
        for (int i = 0; i < s.length(); i++)
        {
            dp[i][i]=true;
        }
        for (int i = 0; i < s.length(); i++)
        {
            char chi=s.charAt(i);
            for (int j = i; j < s.length(); j++)
            {
                char chj=s.charAt(j);
                 if (j-i<3)
                {
                    dp[i][j] = chi == chj;
                }

                if (dp[i][j]&&j-i>maxj-maxi)
                {
                    maxi=i;
                    maxj=j;
                }
            }
        }
        for (boolean[] booleans : dp)
        {
            System.out.println(Arrays.toString(booleans));
        }
        return s.substring(maxi,maxj);
    }
    public static void main(String[] args)
    {
        String babad = new Solution().longestPalindrome("aaaa");
        System.out.println(babad);
    }
}
