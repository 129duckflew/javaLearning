package cn.duckflew.LeetCode;

import java.util.Stack;

public class IsValid
{
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < s.length(); i++)
        {
            char ch=s.charAt(i);
            if (ch=='{'||ch=='['||ch=='(')
            {
                stack.push(ch);
//                System.out.println(ch+"入栈");
            }
            else
            {
                if (stack.isEmpty())return false;
                Character topChar = stack.lastElement();
                if ((topChar=='('&&ch==')')||(topChar=='['&&ch==']')||(topChar=='{'&&ch=='}'))
                {
                    Character pop = stack.pop();
//                    System.out.println(pop+"出栈");
                }
                else return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        IsValid valid = new IsValid();
        System.out.println(valid.isValid("()"));
        System.out.println(valid.isValid("()[]{}"));
        System.out.println(valid.isValid("(]"));
        System.out.println(valid.isValid("([)]"));
        System.out.println(valid.isValid("{[]}"));
    }
}
