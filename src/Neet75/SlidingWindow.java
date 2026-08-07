package Neet75;

import java.util.HashMap;

public class SlidingWindow {
    public static void main(String[] args) {

        int[] inputArray = {7, 1, 5, 3, 6, 5};
        getSlidingWindow(inputArray);

    }
    public static void getSlidingWindow(int[] inputArray){
        int left =0;
        int right = 1;
        int MaxProfit =0;
        for(int i = 0; i < inputArray.length; i++) {
          if(inputArray[left] > inputArray[right]){
              left++;
              right++;
          }
            if(inputArray[left] < inputArray[right]){
               int currentMaxProfit =  inputArray[right] - inputArray[left];
               if(currentMaxProfit > MaxProfit){
                   MaxProfit =  currentMaxProfit;
               }
               right++;
               if(right >= inputArray.length){break;}
            }
        }
        System.out.println("Max profit here : " + MaxProfit);
    }
}
