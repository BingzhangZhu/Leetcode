package easy;

import java.util.Stack;

public class Q20ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> characterStack = new Stack<>();
        if(s.length() == 0){
            return true;
        } else {
            //拆分字符串
            char[] arr = s.toCharArray();
            //将拆分好的字符放入栈中
            return setStackDate(arr, characterStack);
        }
    }

    private static boolean setStackDate(char[] arr, Stack<Character> characterStack) {

        //1、如果右括号开头 则false
        if(arr[0] == ')' || arr[0] == ']' || arr[0] == '}'){
            return false;
        }
        //2、如果左括号开头
        if(arr[0] == '(' || arr[0] == '[' || arr[0] == '{'){
            for (int i = 0; i < arr.length; i++) {
                //2-1、左括号则进栈
                if (arr[i] == '(' || arr[i] == '[' || arr[i] == '{' ) {
                    characterStack.push(arr[i]);
                    continue;
                }
                //2-2、右括号，拿peek匹配
                if(characterStack.empty() == false){
                    if (arr[i] == ')' && characterStack.peek() == '('||
                            arr[i] == ']' && characterStack.peek() == '['||
                            arr[i] == '}' && characterStack.peek() == '{') {
                        characterStack.pop();
                        continue;
                    }else {
                        return false;
                    }
                } else {
                    return false;
                }

            }
            //2-3、左括号有剩余
            if (characterStack.empty() == false){
                return false;
            }else {
                return true;
            }
        }
        //3、如果其他开头
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new Q20ValidParentheses().isValid("[])"));
    }
}

