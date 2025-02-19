package Stacks.Lec_06;

import java.util.Stack;

public class Expression {
    String expression;

    public Expression(String expression) {
        this.expression = expression;
    }

    public Boolean isBalanced() {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            if (ch == '(' || ch == '<' || ch == '{' || ch == '[')
                stack.push(ch);
            if (ch == ')' || ch == '>' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                var top = stack.pop();
                if (
                    (ch == ')' && top != '(') ||
                    (ch == '>' && top != '<') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')
                ) return false;
            }
        }

        return stack.isEmpty();
    }
}
