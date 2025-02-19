package Stacks.Lec_03;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();

        for (char ch :input.toCharArray()) {
            stack.push(ch);
        }
        StringBuffer reversed = new StringBuffer();
        while (!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }

    public static void main(String[] args) {
        String str = "SHREEJIT";
        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(str);

        System.out.println(result);
    }
}