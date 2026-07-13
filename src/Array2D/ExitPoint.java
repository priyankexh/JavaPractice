package Array2D;

public class ExitPoint {
    public static void main(String[] args){

        int[][] inputMatrix = {
                {0,0,1},
                {0,0,1}
        };
        getExitPoint(inputMatrix);
    }

    public static void getExitPoint(int[][] inputMatrix){
        int dir =0;
        int i =0;
        int j =0;
        while(true){
            dir = dir+ (inputMatrix[i][j] % 4);
            if(dir==0){
                j++;
            }
            else if(dir==1){
                i++;
            }
            else if(dir==2){
                j--;
            }
            else if(dir==3){
                i--;
            }

            if(i<0){
                i++; break;
            }
            else if(j<0){
                j++; break;
            }
            else if(i == inputMatrix.length){
                i--; break;
            }
            else if(j == inputMatrix[0].length){
                j--; break;
            }


        }
        System.out.println(i);
        System.out.println(j);



    }

}
