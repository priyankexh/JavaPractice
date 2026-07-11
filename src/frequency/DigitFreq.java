package frequency;

public class DigitFreq {
    public static void main(String[] args){
        int number = 1233345;
        int digit = 3;
        System.out.println(freqCalculator(number, digit));
    }
    public static int freqCalculator(int number, int digit){
        int count =0;
        int lastNumber = 0;
        while(number>0) {
            lastNumber = number % 10;
            if (lastNumber == digit) {
                count++;
            }
            number= number/10;
        }
        return count;
    }
}
