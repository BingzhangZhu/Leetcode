package easy;

import java.util.Stack;

public class Q232ImplementQueueusingStacks {

    private Stack<Integer> storage;
    private Stack<Integer> record;
    int count = 0;
    int peek = 0;
    int pop = 0;

    /** Initialize your data structure here. */
    public Q232ImplementQueueusingStacks() {
        this.storage = new Stack<>();
        this.record = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        storage.push(x);
        count += 1;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        for(int i=0; i<count; i++){
            record.push(storage.pop());
        }
        pop = record.pop();
        for(int i=0; i<count-1; i++){
            storage.push(record.pop());
        }
        count -= 1;
        return pop;
    }

    /** Get the front element. */
    public int peek() {
        for(int i=0; i<count; i++){
            record.push(storage.pop());
        }
        peek = record.peek();
        for(int i=0; i<count; i++){
            storage.push(record.pop());
        }
        return peek;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return count == 0;
    }
}
