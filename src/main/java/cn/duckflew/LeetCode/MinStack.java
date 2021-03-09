package cn.duckflew.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

class MinStack {

    private Stack<Integer> s;
    private Stack<Integer> minData;
    /** initialize your data structure here. */
    public MinStack() {
        s=new Stack<>();
        minData=new Stack<>();
    }

    public void push(int x) {
        s.push(x);
        if (minData.isEmpty()||x<=minData.lastElement())minData.push(x);
    }

    public void pop() {
        if (minData.lastElement().equals(s.pop()))minData.pop();
    }

    public int top() {
        return s.lastElement();
    }

    public int getMin() {
        return minData.lastElement();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
