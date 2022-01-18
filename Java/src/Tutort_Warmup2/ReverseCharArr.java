package Tutort_Warmup2;

public class ReverseCharArr {
    public static void main(String[] args) {
        char[] arr= new char[]{'a','b','c'};
        char[] res =  new char[arr.length];
        char[] res2 =  new char[arr.length];
        //res = reverseChars(arr);
        //for(int i=0; i<res.length; i++)
          //  System.out.println(res[i]);
        res2 = reverseChars2(arr);
        for(int i=0; i<res2.length; i++)
            System.out.println(res2[i]);
    }
    public static char[] reverseChars(char[] arr){
        char[] res = new char[arr.length];

        if(arr.length == 0)
            return res;
        int j=0;
        for(int i=arr.length-1; i>=0; i--){
            res[j++] = arr[i];
        }

        return res;
    }
   public static char[] reverseChars2(char[] arr){
        char[] res = new char[arr.length];

        if(arr.length == 0)
            return res;

        int i = 0;
        int j = arr.length-1;
        while(j>=0){
            res[i]=arr[j];
            i++;
            j--;
        }
        return res;
    }
}
