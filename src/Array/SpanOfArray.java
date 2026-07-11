package Array;

public class SpanOfArray {
    public static void main(String[] args){
        int[] myNum = {6, 15, 30, 40, 4, 11,9};
        System.out.println(getSpan(myNum));
    }

    public static int getSpan(int[] myNum){
    int max= myNum[0];
    int min = myNum[0];
    for(int i=0; i<myNum.length; i++){
        int checker = myNum[i];
        if(checker>max){
            max = checker;
        }
        if(checker<min){
            min = checker;
        }
    }
    return max-min;
    }


}