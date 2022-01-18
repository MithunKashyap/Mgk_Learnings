package Arrays.Searching;

public class BinarySearch {
    public static void main(String[] args) {
        // Prerequisite : Array should be sorted (either increasing or decreasing order)
       // TC = O(nlogn)

        int arr[]= new int[]{1,2,3,4,5,6,7,8,9,10,11};
        int searchEle = 4;
        System.out.println("Found at Pos : "+ binarySearch(arr, searchEle));
    }

    private static int binarySearch(int[] arr, int searchEle){
        int low =0;
        int high = arr.length-1;

        while(low<=high) {
            //int mid = (low+high)/2;
           int mid = low + ((high-low)/2); // To avoid any integer overflow - VERY IMPORTANT

            if(arr[mid]==searchEle)
                return mid;
            else if(arr[mid] < searchEle )
                low = mid+1;// next index of mid will become low and search till high
            else
                high = mid-1;// previous index of mid will become high and search within that area

        }
        return -1;
    }
}
