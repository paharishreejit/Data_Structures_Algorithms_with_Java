package Stacks.Lec_05;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        String str = ")1 + 2)";
        Expression exp = new Expression(str);
        System.out.println(exp.isBalanced());
    }
}
