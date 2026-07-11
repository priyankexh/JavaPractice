package Array;

public class Sum {
    public static void main(String[] args) {
        int[] arrayOne = {3, 1, 0, 7, 5};
        int[] arrayTwo = {1,1,1,1,1,1};
        int arrayOneLength = arrayOne.length;
        int arrayTwoLength = arrayTwo.length;

        int biggerLength = arrayOneLength >= arrayTwoLength? arrayOneLength: arrayTwoLength;
        int smallerLength = arrayOneLength >= arrayTwoLength? arrayTwoLength: arrayOneLength;
        int[] biggerArray = arrayOneLength >= arrayTwoLength? arrayOne : arrayTwo;
        int[] smallerArray = arrayOneLength >= arrayTwoLength? arrayTwo : arrayOne;
        int[] sumArray = new int[biggerLength];
        int[] tempArray = new int[biggerLength];

        for (int i =0; i <biggerLength-smallerLength; i++) {
            tempArray[i] =  0;
        }
        int count =0;
        for (int j =biggerLength-smallerLength; j <biggerLength; j++) {
            tempArray[j] =  smallerArray[count];
            count++;
        }

        for (int k =0; k <biggerLength; k++) {
            sumArray[k] =  biggerArray[k] + tempArray[k];
        }
        for (int l = 0; l <biggerLength; l++) {
            System.out.println(sumArray[l]);
        }

    }
}
