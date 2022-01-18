package Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3,4,5,6,7,8};
        int target = 10;
        int res[] = twoSum_oOfn(arr,target);
        System.out.println(Arrays.toString(res));
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] res = null;
        if(nums.length <2)
            res = new int[]{-1, -1};

        if(nums.length == 2){
            if(nums[0]+nums[1] == target)
                res = new int[]{0,1};
        }else{
            for(int i=0; i<nums.length-1; i++){
                for(int j=1; j<nums.length; j++){
                    int sum = nums[i]+nums[j];
                    if(sum == target){
                        res = new int[]{i,j};
                    }
                }
            }
        }
        return res;
    }

    static int[] twoSum_oOfn(int[] nums, int target) {
        int[] idx = new int[2];
        //O(n)
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(!map.containsKey(val)){
                map.put(nums[i],i);
            }else{
                idx[0] = map.get(val);
                idx[1] = i;
                break;
            }
        }
        return idx;
    }
}
