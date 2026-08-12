package Strings;

public class ASCIIdifference {
    public static void main(String[] args) {
        String inputString = "Hello";
        printStringWithAsciiDifference(inputString);
    }
    public static void printStringWithAsciiDifference(String inputString){
        StringBuilder outputString = new StringBuilder();
        outputString.append(inputString.charAt(0));
        for (int i = 1; i < inputString.length(); i++) {
        char current = inputString.charAt(i);
        char previous = inputString.charAt(i-1);
        int gap = current - previous;
        outputString.append(gap).append(current);
        }
        System.out.println(outputString);

    }
}
