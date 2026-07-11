
package Array;

public class RangeFinder {
    public static void main(String args[]){
        int[] givenArray = {10, 20, 20, 20, 30 ,50, 60 ,70};
        int numberToFind = 20;
        getRange(givenArray, numberToFind);
    }


    public static void getRange(int[] givenArray, int numberToFind ){
        int i=givenArray.length;
        int left = 0;
        int right = givenArray.length;
        int higherRange = 0;
        int lowerrange = 0;
        int mid = (left+right)/2;

        if(givenArray[mid] > numberToFind){
            for(int j =mid; j>0 ; j--) {
                if (givenArray [j] == numberToFind){
                    higherRange = j;
                    break;
                }
            }
            for(int k =0; k< mid ; k++) {
                if (givenArray [k] == numberToFind){
                    lowerrange = k;
                    break;
                }
            }
        }

        if(givenArray[mid] < numberToFind){
            for(int j =mid; j>givenArray.length ; j++) {
                if (givenArray [j] == numberToFind){
                    lowerrange = j;
                    break;
                }
            }
            for(int k =givenArray.length; k< mid ; k--) {
                if (givenArray [k] == numberToFind){
                    higherRange = k;
                    break;
                }
            }
        }

        System.out.println("lowerRange : " + lowerrange + " " + "higherRange : " + higherRange );



    }

}
