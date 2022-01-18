package Arrays;

import org.omg.CORBA.INTERNAL;
import org.omg.PortableInterceptor.INACTIVE;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    static boolean isHappy(int n){
        Set<Integer> set = new HashSet<>();
        boolean isHappy = false;

        while(!set.contains(n)){
            set.add(n);
            int sum=0;
            while(n>0){
                int digit = n%10;
                sum = sum+ (digit*digit);
                n=n/10;
            }
            n=sum;
        }

        if(n==1)
            isHappy=true;

        return isHappy;

    }
}
