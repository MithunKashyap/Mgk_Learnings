package Arrays;

import java.util.Arrays;

public class Product_arr {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        int[] res = findProduct(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findProduct(int arr[]) {
        int [] result = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int product = 1;
            for(int j=i+1;j<arr.length;j++){
                product *= arr[j];
            }
            result[i]=product;
        }
        return result;
    }
}
