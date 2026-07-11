package Array2D;

public class Multiplication {
    public static void main(String[] args){

        int[][] array1= {
                {1, 2} ,
                {3, 4} ,
                {5, 6} ,
        };


        int[][] array2= {
                {2,4} ,
                {3,5} ,
        };

        //multiplyer(array1, array2);
        multiplyerCorrect(array1, array2);
    }
    public static void multiplyer(int[][] array1, int[][] array2){
        int temp =0;
        int temp2 = 0;
        int pointer = 0;
        int[][] resultArray = new int[array1.length][array2[0].length];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2[0].length; j++){
                temp += array1[i][j] * array2[j][pointer];
                resultArray[i][pointer] = temp;

                pointer++;
                temp2 += array1[i][j] * array2[j][pointer];
                resultArray[i][pointer] = temp2;
                pointer = 0;
            }
            System.out.println(temp);
            System.out.println(temp2);
            temp=0;
            temp2=0;
        }

        for(int k=0; k< resultArray.length; k++){

            for(int l=0; l< resultArray[k].length; l++){
                System.out.print(resultArray[k][l] + " ");
            }
            System.out.println(" ");
        }

    }

    public static void multiplyerCorrect(int[][] array1, int[][] array2){

        int[][] resultArray = new int[array1.length][array2[0].length];

        for(int i=0; i<array1.length; i++){
            for(int j=0; j<array2[0].length; j++){
                int temp =0;
                for(int m=0; m<array1[0].length ;m++){
                    temp += array1[i][m] * array2[m][j];
                }
                resultArray[i][j] = temp;
            }

        }

        for(int k=0; k< resultArray.length; k++){

            for(int l=0; l< resultArray[k].length; l++){
                System.out.print(resultArray[k][l] + " ");
            }
            System.out.println(" ");
        }

    }



}
