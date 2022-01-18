package Arrays;

/*
Given an array of length N, at each step it is reduced by 1 element.
In the first step the maximum element would be removed,
while in the second step minimum element of the remaining array would
be removed,
in the third step again the maximum and so on.
Continue this till the array contains only 1
element. And find the final element remaining in the array
 */



        import java.util.Arrays;
        import java.util.LinkedList;
        import java.util.List;
        import java.util.Scanner;

public class MinMaxRemove {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array size : ");
        int n = sc.nextInt();

        Integer[] a = new Integer[n];

        System.out.println("Enter the array ele : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);
        List<Integer> arrList = Arrays.asList(a);
        List<Integer> newList = new LinkedList<>(arrList);

        while(newList.size() > 1) {
            Integer max = newList.remove(newList.size()-1);
            System.out.println("Max ele " +max + " is removed");

            Integer min = newList.remove(0);
            System.out.println("Min ele " +min + " is removed");
        }

        for(Integer ele : newList)
            System.out.println(ele +" is the last element remaining");

    }

}

