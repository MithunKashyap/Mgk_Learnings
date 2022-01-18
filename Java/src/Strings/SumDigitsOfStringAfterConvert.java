package Strings;

public class SumDigitsOfStringAfterConvert {
    public static void main(String[] args) {
        String s = "zbax";
        int k =2;
        int res = getLucky(s,k);
        System.out.println(res);
    }
        static int getLucky(String s, int k) {
            char[] ch = s.toCharArray();
            int sum = 0;

            for(char c: s.toCharArray()){
                int temp = sum + (c - 'a') +1;
                if (temp<10)
                    sum += temp;
                else {
                    int n1 = temp % 10;
                    int n2 = temp / 10;
                    sum = sum + (n1 +n2);
                }

            }

            for (int i = 0; i<k; i++)
                sum = sumOfDig(sum);

            return sum;
        }

        static int sumOfDig(int n){
            int sum =0;
            while(n>0){
                sum += n%10;
                n=n/10;
            }
            return sum;
        }

}
