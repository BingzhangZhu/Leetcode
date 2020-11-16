package easy;

import java.util.*;

public class Q225ImplementStackusingQueues {

    Queue<Integer> storage = new LinkedList();
    Queue<Integer> record = new LinkedList();
    int count = 0;
    int peek = 0;
    int pop = 0;

    /** Initialize your data structure here. */
    public Q225ImplementStackusingQueues() {
        this.storage = new LinkedList();
        this.record = new LinkedList();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        storage.add(x);
        count += 1;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        for(int i=0; i<count-1; i++){
            record.add(storage.poll());
        }
        pop = storage.poll();
        for(int i=0; i<count-1; i++){
            storage.add(record.poll());
        }
        count -= 1;
        return pop;
    }

    /** Get the top element. */
    public int top() {
        for(int i=0; i<count-1; i++){
            record.add(storage.poll());
        }
        peek = storage.peek();
        record.add(storage.poll());
        for(int i=0; i<count; i++){
            storage.add(record.poll());
        }
        return peek;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return count == 0;
    }
}
