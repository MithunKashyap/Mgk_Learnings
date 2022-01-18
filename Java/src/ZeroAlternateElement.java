public class ZeroAlternateElement {
    public static void main(String[] args) {
        int [] arr = {2,9,4,4,15,6};
        int []result = zeroAlternateElements(arr);
        for (int i = 0; i < result.length; ++i)
            System.out.println(result[i]);
    }
    static int[] zeroAlternateElements(int[] inputArray) {
        for (int i = 0; i < inputArray.length; ++i) {
            if (i % 2 == 0) {
                inputArray[i] = 0;
            }
        }
        return inputArray;
    }
}
