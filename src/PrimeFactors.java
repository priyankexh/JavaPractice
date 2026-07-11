public class PrimeFactors {
    public static void main(String[] args){
        int x = 18;

        for(int i=2; i<x ; i++){

            while(x % i==0){
                x = x/i;
                System.out.println(i);
            }
        }
    }

}
