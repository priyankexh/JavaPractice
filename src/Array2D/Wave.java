package Array2D;

public class Wave {
    public static void main(String[] args){
        int[][] inputArray = {
                {1, 2, 7, 10},
                {3, 4, 8, 11},
                {5, 6, 9, 13}
        };
        getWave(inputArray);
    }
    public static void getWave(int[][] inputArray){
        int counter =-1;
        for(int i=0; i<inputArray[0].length;i++ ){

            counter++;
            if(counter<inputArray[0].length){
                for(int j=0; j<inputArray.length;j++ ){
                    System.out.println(inputArray[j][counter]);
                }
            } counter++;
            if(counter<inputArray[0].length){
                for(int k=inputArray.length-1; k>=0;k-- ){
                    System.out.println(inputArray[k][counter]);
                }
            }
        }
    }
}
