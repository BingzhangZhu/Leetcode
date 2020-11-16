package easy;

import java.util.Stack;

public class Q682BaseballGame {
    public int calPoints(String[] ops) {
        Stack<Integer> Stack = new Stack<>();
        int plus1 = 0;
        int plus2 = 0;
        int db = 0;
        int sum = 0;
        for(int i=0; i<ops.length; i++){
            if(ops[i].equals("+")){
                plus1 = Stack.pop();
                plus2 = Stack.peek();
                Stack.push(plus1);
                Stack.push(plus1+plus2);
                sum += plus1+plus2;
            }else if(ops[i].equals("C")){
                sum -= Stack.pop();
            }else if(ops[i].equals("D")){
                db = Stack.peek() * 2;
                Stack.push(db);
                sum += db;
            }else {
                Stack.push(Integer.valueOf(ops[i]));
                sum += Integer.valueOf(ops[i]);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(new Q682BaseballGame().calPoints(new String[]{"5","-2","4","C","D","9","+","+"}));
    }
}
