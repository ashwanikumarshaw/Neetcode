package TwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum_15 {
/*
 * 
 Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] 
 such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

	Notice that the solution set must not contain duplicate triplets.
 */
	static public List<List<Integer>> threeSum(int[] nums) {
		if(nums.length<3)
			return new ArrayList<>();
		
		Arrays.sort(nums);
		List<List<Integer>> list=new ArrayList<>();
		
		for(int i=0;i<nums.length;i++) {
			if(i!=0&&nums[i]==nums[i-1]) continue;
			int j=i+1;
			int k=nums.length-1;
			while(j<k) {
				if(nums[i]+nums[j]+nums[k]==0) {
					List<Integer> threeList=new ArrayList<>();
					threeList.add(nums[i]);
					threeList.add(nums[j]);
					threeList.add(nums[k]);
					list.add(threeList);
					j++;
					k--;

			        while (j < k && nums[j] == nums[j-1]) j++;
				}
				else if(nums[i]+nums[j]+nums[k]>0) k--;
				else j++;
			}
		}
		
		return list;   
	    }
	 
	public static void main(String[] args) {

		 System.out.println(threeSum(new int[] {1,2,3,4}));
		 System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
		 System.out.println(threeSum(new int[] {-1,0,-1}));
		 System.out.println(threeSum(new int[] {-2,0,0,2,2}));
		 
	}

}
