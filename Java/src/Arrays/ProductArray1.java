package Arrays;

import java.util.Arrays;

// https://leetcode.com/problems/product-of-array-except-self/
public class ProductArray1 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4};
        int[] res = productExceptSelf(nums);
        System.out.println(Arrays.toString(res));
    }

    static int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] answers = new int[l];

        //LHS
        int prod = 1;
        for (int i = 0; i < l; i++) {
            answers[i] = prod;
            prod = prod * nums[i];
        }

        //RHS
        prod = 1;
        for (int i = l-1; i >= 0; i--) {
            answers[i] = answers[i]*prod;
            prod = prod * nums[i];
        }

        return answers;
    }
}
