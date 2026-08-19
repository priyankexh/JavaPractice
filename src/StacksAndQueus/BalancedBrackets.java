package StacksAndQueus;

import java.util.Stack;

public class BalancedBrackets {
    public static void main(String[] args) {
        String inputExpression1 ="[(a+b)+{(c+d)*(e/f)}]" ;
        String inputExpression2 =  "[(a+b)+{(c+d)*(e/f)]}";
        String inputExpression3 =  "[(a+b)+{(c+d)*(e/f)}";
        String inputExpression4 =  "([(a+b)+{(c+d)*(e/f)}]";
        checkBalancedBrackets(inputExpression1);
        checkBalancedBrackets(inputExpression2);
        checkBalancedBrackets(inputExpression3);
        checkBalancedBrackets(inputExpression4);
    }

    public static void checkBalancedBrackets(String inputExpression) {
        Stack<Character> checker = new Stack<>();
        for (int i = 0; i < inputExpression.length(); i++) {
            if(String.valueOf(inputExpression.charAt(i)).equals("[") ||
               String.valueOf(inputExpression.charAt(i)).equals("(") ||
               String.valueOf(inputExpression.charAt(i)).equals("{")){
                checker.push(inputExpression.charAt(i));
            }
            if(String.valueOf(inputExpression.charAt(i)).equals("]") ||
               String.valueOf(inputExpression.charAt(i)).equals(")") ||
               String.valueOf(inputExpression.charAt(i)).equals("}")){
                if (String.valueOf(inputExpression.charAt(i)).equals(checker.getLast())){
                    checker.pop();
                }
            }

        }
        System.out.println(checker);
        System.out.println(checker.isEmpty() ? "balanced" : "not balanced");
    }
}
