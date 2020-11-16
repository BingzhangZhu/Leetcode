package easy;

import java.util.Stack;

public class Q844BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> characterStack = new Stack<>();
        //拆分字符串
        char[] arr_S = S.toCharArray();
        char[] arr_T = T.toCharArray();
        //将拆分好的字符放入栈中
        return setStackDate(arr_S, characterStack).equals(setStackDate(arr_T, characterStack));
        }

    private static String setStackDate(char[] arr_S, Stack<Character> characterStack) {
        for (int i = 0; i < arr_S.length; i++) {
            if (arr_S[i] != '#') {
                characterStack.push(arr_S[i]);
                continue;
            } else {
                if(!characterStack.empty()){
                    characterStack.pop();
                }
            }
        }
        String result_S = "";
        while (!characterStack.empty()){
            result_S += characterStack.pop();
        }
        return result_S;
    }

    public static void main(String[] args) {
        System.out.println(new Q844BackspaceStringCompare().backspaceCompare("caa##a","cbb##a"));
    }
}
