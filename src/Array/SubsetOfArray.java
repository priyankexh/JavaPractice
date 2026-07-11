package Array;

public class SubsetOfArray {
    public static void main(String[] args){
        int[] arr = {2,3,4};
        int [] binArray = getSubsets(arr);
        for(int x =0; x<= binArray.length; x++){
            System.out.println(binArray[x]);
        }
    }

    public static int[] getSubsets(int[] inputArray){
        int limit = (int) Math.pow(2, inputArray.length-1);
        int[] binaryArray = new int[inputArray.length];
        int rem = 0;
        int count=0;
        int finalNo = 0;
        for(int i=0; i<=limit ; i++){
            while(i !=0){
                rem  = i % 2;

                finalNo += rem * (int) Math.pow(10,count) ;
                count++;
                i = i/2;
            }
            for(int j=binaryArray.length-1; j>=0 ; j--){
                int temp = finalNo % 10;
                binaryArray[j] = temp;
                finalNo = finalNo/10;
            }

        }
        return binaryArray;
    }


}


