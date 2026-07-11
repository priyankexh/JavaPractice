package Array2D;

public class Spiral {
    public static void main(String[] args){
        int[][] inputArray = {
                {1,2,3,5},
                {4,5,6,8},
                {7,8,9,9},
                {7,8,9,4}
        };
        getSpiral(inputArray);
    }
    public static void getSpiral(int[][] inputArray){
        int up = 0;
        int down = inputArray.length -1;
        int right = inputArray[0].length -1;
        int left = 0;
        int numberOfElements = inputArray.length * inputArray[0].length;
        while (up <= down &&
                left <= right) {
            // top to bottom
            for (int i = up; i < down; i++) {
                System.out.println(inputArray[i][left]);
            }

            // left to right
            for (int i = left; i < right; i++) {
                System.out.println(inputArray[down][i]);
            }
            // bottom to top
            for (int i = down; i > up; i--) {
                System.out.println(inputArray[i][right]);
            }

            // right to left
            for (int i = right; i > left; i--) {
                System.out.println(inputArray[up][i]);
            }
            up++;
            left++;
            down--;
            right--;

        }

    }
}
