package Arrays;

import java.util.Arrays;


/*
given an array replace every element by greater element on right side (including the current element)

I/p:  16 17 4 3 5 2
O/P: 17 17 5 5 5 2

 */
public class GreaterElement2_inclusive {
    public static void main(String[] args) {
        int[] arr = new int[]{16,17,4,3,5,2};
        int[] res = greaterElementRight_1(arr);
        System.out.println(Arrays.toString(res));
    }
    static int[] greaterElementRight_1(int[] arr){

        int[] res = new int[arr.length];

        for(int i=arr.length-2; i>=0;i--){
            int a = arr[i];
            int b = arr[i+1];
            int max =Math.max(a,b);
            if(res[i] > max){
                max= res[i];
                res[i]= max;
            }
        }
        res[arr.length-1]=arr[arr.length-1];
        return res;
    }
}
