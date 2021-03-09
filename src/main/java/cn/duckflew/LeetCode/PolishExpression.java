package cn.duckflew.LeetCode;

import java.util.*;

public class PolishExpression
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
    public String[]  getPolish(String s)
    {
        /**
         * 中缀表达式转换成后缀表达式
         */
        List<String> res =new ArrayList<>();
        Stack<Character> ops=new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            if (isDigital(ch))
            {
                StringBuilder num=new StringBuilder();
                if (isDigital(ch))
                {
                    num.append(ch);
                    int nextIndex=i+1;
                    while (nextIndex<s.length())
                    {
                        char next=s.charAt(nextIndex);
                        if (isDigital(next))
                        {
                            num.append(next);
                            nextIndex++;
                        }
                        else
                            break;
                    }

                }
                
                res.add(num.toString());
            }
            else if (ch=='*'||ch=='/')
            {
                res.add( String.valueOf(ch));
            }
            else if (ch=='+'||ch=='-')
            {
                char top;
                while (true)
                {
                    if (ops.size()==0)
                    {
                        ops.push(ch);
                        break;
                    }
                    top=ops.lastElement();
                    if (top=='*'||top=='/')
                    {
                        /**
                         * 比我现在的优先级高 那就直接入队列
                         */
                        res.add(String.valueOf(ops.pop()));
                    }
                    else
                    {
                        ops.push(ch);
                        break;
                    }
                }
            }
            else if (ch=='(')ops.push(ch);
            else if (ch==')')
            {
                char aboveOfLeftKuoHao;
                while (true)
                {
                    /**
                     * 如果碰到右括号  就把当前的所有操作全部出栈进入res队列 知道遇到左括号
                     */
                    aboveOfLeftKuoHao=ops.pop();
                    if (aboveOfLeftKuoHao=='(')break;
                    else
                    res.add(String.valueOf(aboveOfLeftKuoHao));
                }
            }
        }
        while (!ops.isEmpty())res.add(String.valueOf(ops.pop()));
        return res.toArray(new String[0]);
    }

    private boolean isDigital(char ch)
    {
        return ch>='0'&&ch<='9';
    }

    public int calculateZhongXu(String[] s)
    {
        /**
         * 逆波兰表达式(后缀表达式) 求值
         */
        Stack<Integer> nums=new Stack<>();
        Stack<String>  ops=new Stack<>();
        for (int i = 0; i < s.length; i++)
        {
            String cur = s[i];
            if (cur.equals("*")||cur.equals("/")||cur.equals("+")||cur.equals("-"))
            {
                int a=nums.pop();
                int b=nums.pop();
                nums.push(calcu(b,a,cur));
            }
            else nums.push(Integer.valueOf(cur));
        }
        Integer res = nums.pop();
        return res;
    }
    public int calculate(String s)
    {
        String[] polish = getPolish(s);
        int res=calculateZhongXu(polish);
        return res;
    }
}
