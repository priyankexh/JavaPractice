package Array;

public class ReverseAnArray {
    public static void main(String[] args){
        int[] a1 = {1,2,3,4,5};
        int[]res = getReverseArray(a1);

        for(int j =0; j<res.length; j++){
            System.out.print(res[j]);
        }
    }

    private static int[] getReverseArray(int[] a1) {
        int reverseCounter = a1.length-1;
        for(int i =0; i<a1.length-1; i++){
            int temp = a1[i];
            a1[i] = a1[reverseCounter];
            a1[reverseCounter] = temp;
            reverseCounter--;
        }

        return a1;
    }

}
