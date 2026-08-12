package StacksAndQueus;

import java.util.Stack;

public class DuplicateBrackets {

    public static void main(String[] args) {
        String inputString1 = "(a+b)+(a+b)";
        String inputString2 = "((a+b)+(a+b))";
        String inputString3 = "(a+b)+((a+b))";
        checkDuplicateBrackets(inputString1);
        checkDuplicateBrackets(inputString2);
        checkDuplicateBrackets(inputString3);
    }

    public static void checkDuplicateBrackets(String inputString) {
        Stack<Character> checker = new Stack<>();

        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);

            if (ch != ')') {
                checker.push(ch);
            } else {

                if (checker.peek() == '(') {
                    System.out.println("unnecessary brackets found");
                    return;
                }

                while (checker.peek() != '(') {
                    checker.pop();
                }

                checker.pop();
            }
        }

        System.out.println("all good");
    }
}
