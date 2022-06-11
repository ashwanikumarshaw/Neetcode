package ArrayAndHashing;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_1 {
    static public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> n=new HashMap<>();
        for(int i=0;i<nums.length;i++)
            n.put(nums[i],i);
        for(int i=0;i<nums.length;i++)
            if(n.containsKey(target-nums[i])&&n.get(target-nums[i])!=i){
                int[] arr={i,n.get(target-nums[i])} ;
                return arr;
            }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {2,7,11,15},9));
    }

}
