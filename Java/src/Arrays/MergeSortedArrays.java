package Arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1,2,3,4,0,0,0};
        int[] nums2 =  new int[]{2,5,6,0};
        merge(nums1, 3, nums2, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=0; i<n; i++){
            nums1[i+m] = nums2[i];
        }

        Arrays.sort(nums1);
        for(int i=0; i<nums1.length; i++){
            System.out.println(nums1[i]);
        }
    }
}
