package Arrays;

import java.util.Arrays;

public class mergeArr {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 3, 4, 5};
        int[] arr2 = new int[] {2, 6, 7, 8};
        int[] res = mergeArrays(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
        // merge arr1 and arr2 into a new result array
        public static int[] mergeArrays(int[] arr1, int[] arr2)
        {
            int n = arr1.length;
            int m = arr2.length;
            int i = 0, j = 0, k = 0;
            int[] merged = new int[n+m];

            while(i<n && j<m){
                if(arr1[i] < arr2[j])
                    merged[k++] = arr1[i++];
                else
                    merged[k++] = arr2[j++];
            }
            while(i<n)
                merged[k++]=arr1[i++];

            while(j<m)
                merged[k++]=arr2[j++];

            return merged;
        }
}
