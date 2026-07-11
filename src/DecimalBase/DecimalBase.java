package DecimalBase;

public class DecimalBase {

    public static void main(String[] args){
        int number=57;
        int rem = 0;
        int count=0;
        int finalNo = 0;
        while(number !=0){
            rem  = number % 2;

            finalNo += rem * (int) Math.pow(10,count) ;
            count++;
            number = number/2;
        }
        System.out.println(finalNo);
    }
}
