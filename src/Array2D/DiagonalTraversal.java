package Array2D;

public class DiagonalTraversal {
    public static void main(String[] args){
        int[][] inputArray ={
                { 1, 2 ,3 ,4 ,5},
                { 6, 7, 8, 9, 10},
                { 11, 12,13,14, 15},
                {16, 17, 18, 19, 20}
        };
        getDiagonalTraversal(inputArray);
    }
    public static void getDiagonalTraversal(int[][] inputArray){

        for (int g = 0; g < inputArray.length; g++) {
            for (int i = 0, j=g; j<inputArray.length ; i++, j++) {
                System.out.println(inputArray[i][j]);
            }  
        }




        //Print
        /*for (int i = 0; i < inputArray.length; i++) {
            for (int j = 0; j < inputArray[0].length; j++) {
                System.out.print(inputArray[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        } */
    }
}
