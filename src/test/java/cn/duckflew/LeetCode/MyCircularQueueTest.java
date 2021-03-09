package cn.duckflew.LeetCode;

import junit.framework.TestCase;
import org.junit.Test;

public class MyCircularQueueTest extends TestCase
{
    @Test
    public void testMyCircularQueue()
    {
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3
        circularQueue.enQueue(1);  // 返回 true
        circularQueue.enQueue(2);  // 返回 true
        circularQueue.enQueue(3);  // 返回 true
        circularQueue.enQueue(4);  // 返回 false，队列已满
        int rear = circularQueue.Rear();// 返回 3
        System.out.println(rear);
        circularQueue.isFull();  // 返回 true
        circularQueue.deQueue();  // 返回 true
        circularQueue.enQueue(4); // 返回 true
        circularQueue.Rear();  // 返回 4
    }
}