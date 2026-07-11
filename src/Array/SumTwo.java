package Array;

public class SumTwo {
    public static void main(String[] args) {
        int[] arrayOne = {3, 1, 0, 7, 5};
        int[] arrayTwo = {1,1,1,1,1,1};
        int arrayOneLength = arrayOne.length;
        int arrayTwoLength = arrayTwo.length;
        int biggerLength = arrayOneLength >= arrayTwoLength? arrayOneLength: arrayTwoLength;

        int numberOneRaw =0;
        int counter=arrayOneLength-1;
        for (int i =0; i <arrayOneLength; i++) {
            numberOneRaw += arrayOne[i] * (int) Math.pow(10, counter);
            counter--;
        }
        System.out.println(numberOneRaw);

        int numberTwoRaw =0;
        int counter2=arrayTwoLength-1;
        for (int j =0; j <arrayTwoLength; j++) {
            numberTwoRaw += arrayTwo[j] * (int) Math.pow(10, counter2);
            counter2--;
        }
        System.out.println(numberTwoRaw);

        int resultNumerRaw = numberOneRaw + numberTwoRaw;

        System.out.println(resultNumerRaw);

        int resultNumerArray[] = new int[biggerLength+1];
        int ctr =0;
        while(resultNumerRaw !=0){
            int temp=  resultNumerRaw % 10;

            resultNumerArray[ctr] = temp;
            ctr++;
            resultNumerRaw = resultNumerRaw/10;
        }
        for (int l = 0; l <biggerLength; l++) {
            System.out.println(resultNumerArray[l]);
        }

    }
}
