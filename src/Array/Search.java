package Array;

public class Search {

    public static void main(String args[]){
        int[] givenArray = {10, 20, 30 , 40 ,50, 60 ,70};
        int numberToFind = 90;
        //System.out.println(getLinearSaerch(givenArray, numberToFind));
        System.out.println(getBinarySaerch(givenArray, numberToFind));
    }
    public static boolean getLinearSaerch(int[] givenArray, int numberToFind ){
        for(int i= 0; i< givenArray.length; i++){
            if(givenArray[i] == numberToFind) {
                return true;
            }

        }
        return false;
    }
    public static Boolean getBinarySaerch(int[] givenArray, int numberToFind ){
        int right = givenArray.length - 1;
        int left = 0;
        int mid;
        while(left <= right){
            mid = (right + left) / 2;
            if(givenArray[mid] == numberToFind) { return true; }
            if(givenArray[mid] > numberToFind) {
                right = mid -1;
            }
            if(givenArray[mid] < numberToFind) {
                left = mid +1;
            }
        }
        return false;
    }
}
