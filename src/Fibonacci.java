import java.util.ArrayList;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
    int n = 20;
    System.out.println(fibonacci(n));
    }

// 0 , 1 , 1, 2, 3 , 5 , 8 , 13, 21 ....

    public static List<Integer> fibonacci(Integer n){
    Integer num1 = 0;
    Integer num2 = 1;
    Integer sum = 0;
    ArrayList<Integer> fibo = new ArrayList<>();
    fibo.add(0);
    fibo.add(1);

    for(int i = 0; i<n; i++){

        sum = num1 + num2;
        num1 = num2;
        num2 = sum;
        fibo.add(sum);
        if(sum>n) break;
    }
    return fibo;
    }

}
/*
 0 + 1 == sum
 num1 = 1
 num2 = 1

 sum = 1 + 1 = 2
 num1 = 1
 num2 = 2

 sum = 1 + 2  = 3
 num1 = 2
 num2 = 3

 sum = 2 + 3  = 5
 num1 = 3
 num2 = 5

 sum = 3 + 5 = 8
 num1 = 5
 num 2 = 8

 sum =  5 + 8  =13

 */