package Stacks.Lec_02;

public class Main {
    public static String reverse(String input) {
        String reversedStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversedStr += input.charAt(i);
        }

        return reversedStr;
    }
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverse(str));
    }
}
