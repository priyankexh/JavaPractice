package DecimalBase;

public class AnyBaseToDecimal {
    public static void main(String[] args){
        int number=57;
        int rem = 0;
        int count=0;
        int finalNo = 0;
        int base1= 2;
        int base2= 10;
        while(number !=0){
            rem  = number % base2;

            finalNo += rem * (int) Math.pow(base1,count) ;
            count++;
            number = number/base2;
        }
        System.out.println(finalNo);
    }

}
