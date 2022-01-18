package Arrays;

import java.util.Arrays;

/*
Q1.Greater Element Right Hand
Given an array replace every element by greater element on right side (not including the element) All elements are positive. Array can not be empty

I/p: 16 17 4 3 5 2
O/P: 17 5  5 5 2 -1

I/p: 6 2 4 5 3 1
O/P:5 5 5 3 1 -1


Brute Force or Naive Approach:
  //1. Iterate over an array (use 2 loops)
  //2. First loop to keep track of each elements of array
  //3. Another loop while is 1 element next to the prev element (inner loop) to check/compare the max element
  //4. Assign max element a variable
  //5. Add the max element to a new array



 1. For every element, find the max ele in RHS
  	Ex: findMax(i+1, n-1)
 */
public class GreaterRight_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{16,17,4,3,5,2};
        // int[] res = greaterElementRight_BruteForce(arr);
       // System.out.println(Arrays.toString(res));
        System.out.println("Better approach 1");
        System.out.println(Arrays.toString(greaterElementRight_BetterApproach2(arr)));
    }

    static int[] greaterElementRight_BruteForce(int[] arr){

        for(int i=0; i<arr.length-1;i++){
            int greater =-1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] > greater){
                    greater = arr[j];
                }
                arr[i] = greater;
            }
        }

        arr[arr.length-1] = -1;
        return arr;
    }

    //Time: O(n) Space: O(n)
    static int[] greaterElementRight_BetterApproach1(int[] arr){
        int[] res = new int[arr.length];
        int max = Integer.MIN_VALUE;
        res[arr.length-1]=-1;
        for(int i=arr.length-2; i>=0;i--){
            max=Math.max(arr[i+1],max);
            res[i]=max;
        }
        return res;
    }
    static int[] greaterElementRight_BetterApproach2(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=arr.length-2; i>=0;i--){
            int temp=arr[i];
            max=Math.max(max,temp);
            arr[i] = max;
        }
        arr[arr.length-1]=-1;
        return arr;
    }

}
