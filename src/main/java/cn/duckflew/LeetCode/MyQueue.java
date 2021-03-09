package cn.duckflew.LeetCode;

import java.util.Stack;

class MyQueue {

    private Stack<Integer> inStack;
    private Stack<Integer> outStack;
    /** Initialize your data structure here. */
    public MyQueue() {
        inStack=new Stack<>();
        outStack=new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        if (outStack.isEmpty())
        {
            while (!inStack.isEmpty())
            {
                outStack.push(inStack.pop());
            }
        }
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (outStack.isEmpty())
        {
            while (!inStack.isEmpty())
            {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (outStack.isEmpty())
        {
            while (!inStack.isEmpty())
            {
                outStack.push(inStack.pop());
            }
        }
        return outStack.lastElement();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inStack.isEmpty()&&outStack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */