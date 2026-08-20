package recursionAndBackTracking;

public class Fibonaci {
    public static void main(String[] args) {
        int fibs = 4;
        System.out.println(printFibonaci(fibs));
    }
    static int printFibonaci(int n){
        if(n<2){
            return n;
        }
       return printFibonaci(n - 1) + printFibonaci(n-2) ;
    }
}
