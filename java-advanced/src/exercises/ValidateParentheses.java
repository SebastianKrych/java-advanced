package exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * the same number of opening and closing parentheses
 * (())  [()] [[([])()]]
 */
public class ValidateParentheses {
    public static void main(String[] args) {
        String parenthesesToValidate1 = "()";
        String parenthesesToValidate2 = "(())";
        String parenthesesToValidate3 = "()()";
        String parenthesesToValidate4 = ")()(";
        String parenthesesToValidate = parenthesesToValidate2;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < parenthesesToValidate.length(); i++) {
            char parenthesis = parenthesesToValidate.charAt(i);
            System.out.println(parenthesis);
            if (parenthesis == '(') {
                stack.push(parenthesis);
            } else {
                Character parenthesisFromStack = stack.pop();
                System.out.println(parenthesisFromStack);
            }
        }
        System.out.println("Validate no elements in the stack");
        for (char c : stack) {
            System.out.println(c);
        }
        if (stack.isEmpty()) {
            System.out.println("Parentheses are balanced");
        } else {
            System.out.println("Parentheses are not balanced!");
        }

    }
}
