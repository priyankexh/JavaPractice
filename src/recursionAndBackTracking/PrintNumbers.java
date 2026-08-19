package recursionAndBackTracking;

public class PrintNumbers {
    public static void main(String[] args) {
        int number = 5;
        getNumbers(number);
    }
    public static void getNumbers(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        getNumbers(n-1);
    }
}
