package Arrays;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-4,-1,0,3,10};
        int[] res = sortedSquares(nums);

        //Arrays.stream(res).forEach(System.out::println);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int i=0;
        int j=nums.length-1;
        int pos = nums.length-1;

        while(i<=j){
            if(Math.abs(nums[i]) > Math.abs(nums[j])){
                res[pos]= nums[i]*nums[i];
                i++;
            }else{
                res[pos] = nums[j]*nums[j];
                j--;
            }
            pos--;
        }
        return res;
    }
}




