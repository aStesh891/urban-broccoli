package urban.broccoli.leetcode.strings;

import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * <p>
 * An input string is valid if:
 * <p>
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * @author Ann Stesh
 */

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println("result:" + isValid(s));
    }

    private static boolean isValid(String s) {
        if (s == null || s.length() == 0) return false;

        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '{' || bracket == '[' || bracket == '(') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    if ((stack.peek() == '(' && bracket == ')')
                            || (stack.peek() == '[' && bracket == ']')
                            || (stack.peek() == '{' && bracket == '}')) {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
