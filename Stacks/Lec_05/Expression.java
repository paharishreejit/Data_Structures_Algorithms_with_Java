package Stacks.Lec_05;

import java.util.Stack;

public class Expression {
    String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    public Boolean isBalanced() {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(')
                stack.push(ch);
            if (ch == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }

        return stack.isEmpty();
    }
}
