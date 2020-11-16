package easy;

import java.util.Stack;

public class Q155MinStack {

    private Stack<Integer> storage;
    private Stack<Integer> record;
    int[] times4Min;
    int n = 0;

    /** initialize your data structure here. */
    public Q155MinStack() {
        this.storage = new Stack<>();
        this.record = new Stack<>();
    }

    public void push(int x) {
        storage.push(x);
        if (record.empty()){
            record.push(x);
            times4Min[n] = 1;
        }else if (x<record.peek()){
            record.push(x);
            n += 1;
            times4Min[n] = 1;
        }else {
            times4Min[n] += 1;
        }
    }

    public void pop() {
        storage.pop();
        if(times4Min[n] == 1){
            times4Min[n] -= 1;
            record.pop();
            if(n!=0){
                n -= 1;
            }
        } else {
            times4Min[n] -= 1;
        }
    }

    public int top() {
        return storage.peek();
    }

    public int getMin() {
        return record.peek();
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