package ArrayAndHashing;

import java.util.HashSet;
import java.util.Set;

/*
Given an integer array nums, return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */

public class ContainsDuplicate_217 {

    static public boolean containsDuplicate(int[] nums) {
        if(nums.length<=1)
            return false;
        Set<Integer> s=new HashSet<>();

        for(int i=0;i<nums.length;i++){

            if(s.contains(nums[i]))
                return true;
            s.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        System.out.println(containsDuplicate(new int[] {1,1,1,3,3,4,3,2,4,2}));
    }
}
