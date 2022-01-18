package Arrays.Searching;
// Given an array, find position of First Occurrence of element in a sorted array
public class FirstOccrOfEle {
    public static void main(String[] args) {
        // Using Binary Search
        int[] arr = new int[]{1,2,3,4,4,4,5,6,7};
        int target = 4;


    }

    private static int firstOccr(int[] arr, int ele) {
        int index = -1;
        int low = 0;
        int high = arr.length;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (ele == arr[mid]) {
                if (mid < index) {
                    index = mid;
                }
                high = mid - 1;
            } else if (ele < arr[mid]) {
                return -1;
            }
        }
    return -1;
    }
}
