public class GcdLcm {
    public static void main(String[] args){
        int x = 20;
        int y = 28;
        System.out.println("GCP : " + gcpFinder(x,y));

        System.out.println("lcm : " + lcmFinder(x,y,gcpFinder(x,y)));
    }

    public static int gcpFinder(int a, int b){
        while( a % b !=0){
            int reminder = a % b;
            a=b;
            b=reminder;
        }
        return b;

    }
    public static int lcmFinder(int a, int b, int gcp){
        return (a*b)/gcp ;
    }

}
