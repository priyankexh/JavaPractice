package Array;

public class BarChart {
    public static void main(String[] args){
        int[] myNum= {3,1,0,7,5};
        int maxFromArray = myNum[0];
        int whereIsIt =0;
        int length =myNum.length;
        for(int p=0; p<=length; p++) {
           for (int i = 0; i < length; i++) {
               if (myNum[i] > maxFromArray) {
                 maxFromArray = myNum[i];
                 whereIsIt = i;
               }
           }


            for (int j = 0; j <= (whereIsIt - 1); j++) {
                System.out.print(" ");
            }
            System.out.print("*");
            int afterStarStart = whereIsIt < myNum.length ? whereIsIt +1 :  myNum.length;
            for (int k = afterStarStart; k <= afterStarStart; k++) {
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
