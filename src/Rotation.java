
public class Rotation {
    public static void main(String[] Args){
        int x = 27391;
        int y = 3;
        if(y>0) {
        System.out.println(rotatorPositive(x, y));
        } else if(y<0) {
            System.out.println(rotatorNegative(x, y));
        }
    }

    public static Integer rotatorPositive(int x, int y){

        int p = x % (int) Math.pow(10, y);
        int t = x / (int) Math.pow(10, y);
        int q = t;
        System.out.println(p);
        System.out.println(t);
        int count = 0;
        while(t>0){
            t = t/10;
            count++;
        }
        return (p* (int) Math.pow(10, count)) +q ;
    }


    public static Integer rotatorNegative(int x, int y){

        int p = x % (int) Math.pow(10, y);
        int t = x / (int) Math.pow(10, y);
        int q = t;
        System.out.println(p);
        System.out.println(t);
        int count = 0;
        while(t>0){
            t = t/10;
            count++;
        }
        return (p* (int) Math.pow(10, count)) +q ;
    }

}
