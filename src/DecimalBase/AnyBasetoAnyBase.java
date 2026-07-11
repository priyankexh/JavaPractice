package DecimalBase;

public class AnyBasetoAnyBase {
    public static void main(String[] args){
    int number = 111001;
    int base1 = 2;
    int base2 = 10;
           System.out.println(getAnyBasetoAnyBase(number,base1,base2));
    }

    public static int getAnyBasetoAnyBase(int number, int fromBase, int toBase ){
        int rem =0;
        int count =0;
        int finalNo =0;
        while(number !=0){
            rem = number % toBase;
            finalNo += rem* (int) Math.pow(fromBase,count);
            number = number/toBase;
            count++;

        }
        return finalNo;
    }

}
