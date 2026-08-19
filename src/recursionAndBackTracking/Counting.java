package recursionAndBackTracking;

public class Counting {
    public static void main(String[] args) {
        int n =10; int start =0;
        getCountingUpto(n, start);
        getCountingUpto2(n);
    }
    public static void getCountingUpto(int n, int s){
        if(n+1 == s){
            return;
        }
        System.out.println(s);
        getCountingUpto(n, s+1);
    }

    public static void getCountingUpto2(int n){
        if(n==0){return;}
        getCountingUpto2(n-1);
        System.out.println(n);
    }
}
