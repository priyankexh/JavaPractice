package Array2D;

public class ShellRotate {
    public static void main(String[] args){
        int[][] inputArray = {
                {1,2,3,4,5,6},
                {7,8,9,10,11,12},
                {13,14,15,16,17,18},
                {19,20,21,22,23,24}
        };
        int shellNo=1;
        int rotateBy =2;
        getShellRotate(inputArray, shellNo,rotateBy );

    }
    public static void getShellRotate(int[][] inputArray, int shellNo, int rotateBy){
        int[] oneD = getOneDfromShell(inputArray, shellNo);
        rotate(oneD, rotateBy);
        fillShell(inputArray, shellNo, oneD);
        for(int i=0; i< inputArray.length; i++){
            for(int j=0; j< inputArray[i].length; j++){
                System.out.print(inputArray[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private static int[] getOneDfromShell(int[][] inputArray, int shellNo) {
        int minR = shellNo - 1;
        int minC = shellNo - 1;
        int maxR = inputArray.length - shellNo;
        int maxC = inputArray[0].length - shellNo;
        int sz = 2 * (maxR - minR +  maxC - minC) ;
        int[] oneD = new int[sz];
        int idx=0;
        for(int i = minR , j = minC ;  i<= maxR ; i++){
            oneD[idx] = inputArray[i][j];
            idx++;
        }
        for(int i = maxR , j = minC +1;  j<= maxC ; j++){
            oneD[idx] = inputArray[i][j];
            idx++;
        }
        for(int i = maxR -1 , j = maxC ;  i>= minR ; i--){
            oneD[idx] = inputArray[i][j];
            idx++;
        }
        for(int i = minR , j = maxC -1 ;  j>= minC +1 ; j--){
            oneD[idx] = inputArray[i][j];
            idx++;
        }
        return oneD;
    }

    private static void fillShell(int[][] inputArray, int shellNo, int[] oneD) {
        int minR = shellNo - 1;
        int minC = shellNo - 1;
        int maxR = inputArray.length - shellNo;
        int maxC = inputArray[0].length - shellNo;

        int idx=0;
        for(int i = minR , j = minC ;  i<= maxR ; i++){
            inputArray[i][j] = oneD[idx];
            idx++;
        }
        for(int i = maxR , j = minC +1;  j<= maxC ; j++){
            inputArray[i][j] = oneD[idx];
            idx++;
        }
        for(int i = maxR -1 , j = maxC ;  i>= minR ; i--){
            inputArray[i][j] = oneD[idx];
            idx++;
        }
        for(int i = minR , j = maxC -1 ;  j>= minC +1 ; j--){
            inputArray[i][j] = oneD[idx];
            idx++;
        }

    }

    private static void rotate(int[] oneD, int rotateBy) {
        if(rotateBy<0){
            rotateBy = rotateBy + oneD.length;
        }
        rotateBy = rotateBy % oneD.length;
        reverse(oneD,0 , oneD.length -1 -rotateBy);
        reverse(oneD, oneD.length -rotateBy,oneD.length -1);
        reverse(oneD ,0, oneD.length -1 );

    }

    private static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

}
