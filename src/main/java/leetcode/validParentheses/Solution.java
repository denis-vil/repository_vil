package validParentheses;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char openBracket = stack.pop();
                if ((bracket == ')' && openBracket != '(') ||
                        (bracket == '}' && openBracket != '{') ||
                        (bracket == ']' && openBracket != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}