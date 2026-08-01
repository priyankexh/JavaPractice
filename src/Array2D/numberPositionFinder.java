package Array2D;

public class numberPositionFinder {
    public static void main(String[] args){
        int[][] inputArray ={
                { 11, 12 ,13 ,14 ,15},
                { 21, 22, 23, 24, 25},
                { 31, 32, 33, 34, 35},
                { 41, 42, 43, 44, 45}
        };
        int numberToFind = 41;
        getNumberPositionBinarySearch(inputArray, numberToFind);
    }
    public static void getNumberPosition(int [][] inputArray, int numberToFind){
        for (int i = 0; i <inputArray.length ; i++) {
            for(int j = 0; j < inputArray[0].length; j++) {
               if (numberToFind == inputArray [i][j]){
                   System.out.println("Found at :" + i + " " + j);
                   break;
               }

            }
        }
    }

    public static void getNumberPositionBinarySearch(int [][] inputArray, int numberToFind){
        int i =0;
        int j= inputArray[0].length -1;
        while (i < inputArray.length && j >=0){
            if(numberToFind == inputArray[i][j]){
                System.out.println("Found at :" + i + " " + j);
                break;
            } else if( numberToFind <inputArray[i][j] ) {
                j--;
            } else if (numberToFind > inputArray[i][j] ) {
                i++;
            }

        }
    }
}
