package Tutort_Warmup2;

public class FirstSecondThirdMax {
    public static void main(String[] args) {
        int[] arr = new int[]{6,1,4,3,2,9,7};
        int[] res = find_max_secMax_thirdMax(arr);
        for (int i=0; i<res.length;i++)
            System.out.println(res[i]);
    }
    static int[] find_max_secMax_thirdMax(int[] arr){
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int thirdMax = Integer.MIN_VALUE;
        int[] res = new int[3];

        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                secMax = max;
                thirdMax = secMax;
                max = arr[i];
            }else if(arr[i] > secMax){
                thirdMax = secMax;
                secMax = arr[i];
            }else if(arr[i] > thirdMax){
                thirdMax = arr[i];
            }
        }
        res[0]=thirdMax;
        res[1]=secMax;
        res[2]=max;

        return res;
    }
}
