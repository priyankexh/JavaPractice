package Neet75;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {

        int[] inputArray = {2,7,11,15};
        getTwoSum(inputArray, 9);

    }
    public static void getTwoSum(int[] inputArray, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            int x = target - inputArray[i];

            if(map.containsKey(x)){
                System.out.println("yes " + map.get(x) + i);
            }
            map.put(inputArray[i], i);
        }

    }


}
