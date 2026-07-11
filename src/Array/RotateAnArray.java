package Array;

public class RotateAnArray {
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5,6};
        int n=3;
        int[]res = getRotatedArray(a1, n);

        for(int j =0; j<res.length; j++){
            System.out.print(res[j]);
        }
    }

    private static int[] getRotatedArray(int[] a1, int n) {
        int loopStartingPoint = a1.length-n-1;
        int counter =a1.length-1;
        for(int i =loopStartingPoint; i<a1.length-1; i++){
            int temp = a1[i];   // temp = 4   ,
            a1[i] = a1[counter];   //6
            a1[counter] = temp;     //4
            counter--;
        }



        return a1;
    }
}
