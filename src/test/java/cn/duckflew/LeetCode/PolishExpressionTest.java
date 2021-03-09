package cn.duckflew.LeetCode;

import junit.framework.TestCase;

public class PolishExpressionTest extends TestCase
{
    public void testGetPolish()
    {
//        String testData="(1+(4+5+2)-3)+(6+8)";
//        String testData="1+1";
        String testData="2-1 + 2";
        PolishExpression polishExpression = new PolishExpression();
        int calculate = polishExpression.calculate(testData);
        System.out.println(calculate);
    }
}