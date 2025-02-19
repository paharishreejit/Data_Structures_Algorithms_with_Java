/*********************************************
 * Name: BracketLinter.java                  *
 * Purpose: Checks if a string is balanced.  *
 * Author: Shreejit Pahari                   *
 *********************************************/

package Stacks.Lec_04;

import java.util.Stack;

public class BracketLinter {
    public boolean isBalanced(String input) {
        if (input == null) throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '<' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if ( ch == ')' || ch == '>' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char previous = stack.pop();
                if ((ch == ')' && previous != '(') ||
                    (ch == '>' && previous != '<') ||
                    (ch == '}' && previous != '{') ||
                    (ch == ']' && previous != '['))
                    return false;
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String str = "(1)[ <+] 2>";
        BracketLinter lint = new BracketLinter();
        System.out.println(lint.isBalanced(str));
    }
}
