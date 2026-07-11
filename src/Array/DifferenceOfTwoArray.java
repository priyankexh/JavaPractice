package Array;

public class DifferenceOfTwoArray {
    public static void main(String[] args){
    int[] a1 = {2};
    int[] a2 = {1,0,0};
    int[]res = (getArrayDifference(a1,a2));

     for(int j =0; j<res.length; j++){
         System.out.print(res[j]);
     }
    }

    public static int[] getArrayDifference(int[] a1, int[] a2){
        int smallArrayLength = a1.length-1;
        int[] resultArray = new int[a2.length]; //bigger array
        int carry = 0;
        for(int i=a2.length-1; i>=0; i--){

            if(smallArrayLength>=0 && a2[i]<a1[smallArrayLength]){


                    resultArray[i] = a2[i] + 10 + carry - a1[smallArrayLength];
                    carry = -1;


            } else{
                // out of bound
                if(smallArrayLength<=0)
                {
                    int d = a2[i] + carry;
                    if(d<0){
                        d +=10;
                    }

                    resultArray[i] = d;
                }
                // NOT out of bound
                else if (smallArrayLength>0) {
                    resultArray[i] = a2[i] - a1[smallArrayLength];
                    carry=0;
                }
            }
            smallArrayLength--;

        }
        return  resultArray;

        }


    }



