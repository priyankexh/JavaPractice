package Array2D;

import java.util.Arrays;

public class PrintTwoDArray {
    public static void main(String[] Args){

        int[][] resultArr = {
                {1, 2, 3 , 4},
                {7, 5, 6, 8},
                {10, 11, 12,23}
        };

        for(int i=0; i< resultArr.length; i++){

            for(int j=0; j< resultArr[i].length; j++){
            System.out.print(resultArr[i][j] + " ");
            }
            //System.out.println(Arrays.toString(resultArr[i]) + " ");
            System.out.println(" ");
        }


    }
}
