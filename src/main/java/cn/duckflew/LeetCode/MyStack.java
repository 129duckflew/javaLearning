package cn.duckflew.LeetCode;

import java.util.ArrayDeque;
import java.util.Queue;

class MyStack {

    private Queue<Integer> mainQueue;
    private Queue<Integer> viceQueue;
    /** Initialize your data structure here. */
    public MyStack() {
        mainQueue=new ArrayDeque<>();
        viceQueue=new ArrayDeque<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
       mainQueue.add(x);
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
       while (mainQueue.size()>1)
       {
           viceQueue.add(mainQueue.poll());
       }
       int popRes=mainQueue.poll();
       while (!viceQueue.isEmpty())
       {
           mainQueue.add(viceQueue.poll());
       }
       return popRes;
    }

    /** Get the top element. */
    public int top() {
        while (mainQueue.size()>1)
        {
            viceQueue.add(mainQueue.poll());
        }
        int peekRes=mainQueue.peek();
        viceQueue.add(mainQueue.poll());
        while (!viceQueue.isEmpty())
        {
            mainQueue.add(viceQueue.poll());
        }
        return peekRes;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return mainQueue.isEmpty()&&viceQueue.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */
