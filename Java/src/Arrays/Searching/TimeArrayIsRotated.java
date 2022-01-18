package Arrays.Searching;
//How many times sorted array is rotated(No Duplicates)
public class TimeArrayIsRotated {
    public static void main(String[] args) {
        int[] arr = new int[]{11,12,15,18,2,5,8};
        //Output : 4;

    }

    private static int numOfTimesArrayIsSorted(int[] arr){
        int l=0;
        int h=arr.length;

        if(arr[l] <= arr[h]){
            return l;
        }
        return -1;
    }
}
