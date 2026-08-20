package recursionAndBackTracking;

public class BS {
    public static void main(String[] args) {
      int[] inputArray = {1,2,3,4,5};
      int target = 4;
      System.out.println(getBinarySearch(inputArray,target,0,inputArray.length-1));

    }
    public static int getBinarySearch(int [] inputArray, int target, int start, int end){
      if(start>end){
          return -1;
      }
      int m = start+ (end-start)/2;
      if(inputArray[m] == target){
          return m;
      }
      if(target < m){
         return getBinarySearch(inputArray, target, start, m-1);
      }
         return getBinarySearch(inputArray,target,m+1,end);

    }
}
