package Array;

public class NumberFinder {
    public static void main(String[] args){
        int[] myNum = {6, 15, 30, 40, 4, 11,9};
        int findThisNumber= 15;
        System.out.println(findNumber(myNum,findThisNumber ));
    }

    public static boolean findNumber(int[] myNum, int findThisNumber){

        for(int i=0; i<myNum.length; i++){
         if(myNum[i]==findThisNumber){
             return true;
         }
        }
        return false;
    }

}
