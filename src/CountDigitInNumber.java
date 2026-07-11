public class CountDigitInNumber {

    public static void main(String[] Args){
        int n = 12345;
        System.out.println(digitCounter(n));
    }

    public static Integer digitCounter(Integer x){
        int count = 0;
        while(x !=0){
            x = x/10;
            count++;
        }
        return count;
    }
}
