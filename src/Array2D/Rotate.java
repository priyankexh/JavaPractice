package Array2D;

public class Rotate {
    public static void main(String[] args){
        int[][] inputMatrix = {
                {1,2,3,10},
                {4,5,6,11},
                {7,8,9,12},
                {13,14,15,16}
        };
        getRotatedArray(inputMatrix);
    }
    public static void getRotatedArray(int[][] inputArray){
        //transpose columns
        for(int i=0; i< inputArray.length; i++){
            for(int j=i; j< inputArray[i].length; j++){
                int temp = inputArray[i][j];
                inputArray[i][j] = inputArray[j][i];
                inputArray[j][i] = temp;
            }
        }

        //reverse Rows
        for(int i=0; i< inputArray.length; i++){
           int l=0;
           int r=inputArray[0].length-1;
           while(l<r){
               int temp = inputArray[i][l];
               inputArray[i][l] = inputArray[i][r];
               inputArray[i][r] = temp;
               l++;
               r--;
           }
        }


        //PRINT
        for(int i=0; i< inputArray.length; i++){
            for(int j=0; j< inputArray[i].length; j++){
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println(" ");
        }



    }
}
