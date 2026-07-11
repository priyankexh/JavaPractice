public class InverseOfNumber {
    public static void main(String[] Args){
        // 3  2  1  4  // num
        // 4  3  2  1  // index

        // 1  4  3  2  // result
        // 4  3  2  1  // index
        int x = 3214;
        System.out.println(inverse(x));


    }

    public static Integer inverse(int x){

        int count =0;
        int latest = 0;
        while(x>0){
            int ele= x % 10;
            count++;
            x= x/10;
            latest += count * (int) Math.pow(10, ele-1);

        }
        return latest;
    }

}
