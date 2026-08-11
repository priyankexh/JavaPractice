package Neet75;

import java.util.HashMap;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,4,5};
        long start =  System.nanoTime();
        System.out.println(containsDuplicate(inputArray));
        long end = System.nanoTime();
        System.out.println(end - start + " : time for first" );

        start =  System.nanoTime();
        System.out.println(containsDuplicateUsingHashMap(inputArray));
        end = System.nanoTime();
        System.out.println(end - start + " : time for second" );
    }

    public static Boolean containsDuplicate(int[] inputArray ) {
        boolean flag = false;
        for (int i = 0; i < inputArray.length; i++) {
            for (int j = i+1; j < inputArray.length; j++) {
                if(inputArray[i] == inputArray[j]){
                   flag = true;
                   break;
                }
            }
        }
        return flag;
    }
    public static Boolean containsDuplicateUsingHashMap(int[] inputArray ) {
        HashMap<Integer, Integer> container = new HashMap<>();
        for (int i = 0; i < inputArray.length; i++) {
            if(container.containsKey(inputArray[i])){
            return true;
            }
            container.put(inputArray[i],i);
        }
        return false;
    }
}
