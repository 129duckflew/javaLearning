package cn.duckflew.LeetCode;
class MyCircularQueue {

    private int[] queue;
    private int capacity;
    private int size;
    private int head;
    private int tail;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        queue=new int[k];
        size=0;
        head=0;
        tail=0;
        capacity=k;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if (size==capacity)return false;
        queue[tail]=value;
        size++;
        tail=(head+size)%capacity;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if (size==0)return false;
        size--;
        head=(head+1)%capacity;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (size==0)return -1;
        return queue[head];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (size==0)return -1;
        int index=tail-1<0?(tail-1+capacity):tail-1;
        return queue[index];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return size==0;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return size==capacity;
    }
//    public void show()
//    {
//        if (size==0)System.out.println("null");
//        else
//        {
//            System.out.println("head="+head+"    tail="+tail+"   size="+size) ;
//            do
//            {
//                if (head >= capacity) head = head % capacity;
//                System.out.print(queue[head++] + " ");
//            } while (head != tail);
//        }
//    }

}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */