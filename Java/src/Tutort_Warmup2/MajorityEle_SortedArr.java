package Tutort_Warmup2;

public class MajorityEle_SortedArr {
    public static void main(String[] args) {
        int[] arr = {2,4,5,5,5,5,5,6,6};
        System.out.println(majorityEle_sortedArr(arr, 5));
    }

    public static boolean majorityEle_sortedArr(int[] arr, int target){
        boolean isMajority = false;
        int count = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        if(count > arr.length/2){
            isMajority = true;
        }
        return isMajority;
    }
}
