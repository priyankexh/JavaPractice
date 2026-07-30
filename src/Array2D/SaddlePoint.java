package Array2D;

public class SaddlePoint {
    public static void main(String[] args){
        int[][] inputArray ={
                { 11, 12 ,13 ,14 ,15},
                { 21, 22, 23, 24, 25},
                { 31, 32, 33, 34, 35},
                { 41, 42, 43, 44, 45}
        };
        getSaddlePoint(inputArray);
    }
    public static void getSaddlePoint(int[][] inputArray) {

        for (int i = 0; i < inputArray.length; i++) {
            int svj =0;
            for (int j = 0; j < inputArray[0].length; j++) {
                if(inputArray[i][j] < inputArray[i][svj]){
                    svj =j;
                }
            }

            boolean flag =true;
            for (int k = 0; k < inputArray.length ; k++) {
                if(inputArray[k][svj] > inputArray[i][svj]){
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                System.out.println(inputArray[i][svj]);
                return;
            }
        }
        System.out.println("invalid");
    }
}
