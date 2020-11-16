package easy;

import java.util.Stack;

public class Q1047RemoveAllAdjacentDuplicatesInString {
    public String removeDuplicates(String S) {
        Stack<Character> characterStack = new Stack<>();
        Stack<Character> characterStack_new = new Stack<>();
        if(S.length() == 0){
            return "";
        } else {
            //拆分字符串
            char[] arr = S.toCharArray();
            //将拆分好的字符放入栈中 若与上一个重复 则双双删除
            for(int i=0; i<S.length(); i++){
                if(characterStack.empty()){
                    characterStack.push(arr[i]);
                } else {
                    if (characterStack.peek().equals(arr[i])){
                        characterStack.pop();
                    } else {
                        characterStack.push(arr[i]);
                    }
                }
            }
            //将字符放入另一个栈
            while(!characterStack.empty()){
                characterStack_new.push(characterStack.pop());
            }
            //新栈中元素输出
            StringBuilder result = new StringBuilder();
            while(!characterStack_new.empty()){
                result.append(characterStack_new.pop());
            }
            return result.toString();
        }
    }
}
