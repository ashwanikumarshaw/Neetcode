package ArrayAndHashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
 */
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
        System.out.println(Arrays.toString( twoSum(new int[] {2,7,11,15},9)));
    }

}
