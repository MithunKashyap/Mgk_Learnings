package Tutort_Warmup2;

public class Running_Sum_1d_Array {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2, 3,4,5};
        int[] res = runningSum(nums);
        for(int r : res)
            System.out.print(r +" ");
    }

    public static int[] runningSum(int[] nums) {
        int[] res = new int[nums.length];
        res[0] = nums[0];
        for (int i=1; i< nums.length; i++){
            res[i] = res[i-1] + nums[i];
        }
        return res;
    }
}
