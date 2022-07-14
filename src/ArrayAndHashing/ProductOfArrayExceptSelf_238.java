package ArrayAndHashing;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_238 {
/*
 Given an integer array nums, return an array answer such that answer[i] is equal to the product of 
 all the elements of nums except nums[i].

 The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

 You must write an algorithm that runs in O(n) time and without using the division operation.
 */
	static int[] productExceptSelf(int[] nums) {
		
		int[] pre=new int[nums.length];
		int[] post=new int[nums.length];
		pre[0]=1;
		post[nums.length-1]=1;
		for(int i=1;i<nums.length;i++){
			pre[i]=pre[i-1]*nums[i-1];
			post[nums.length-1-i]=post[nums.length-i]*nums[nums.length-i];
		}
		
		int[] num=new int[nums.length];
		for(int i=0;i<nums.length;i++){
			num[i]=pre[i]*post[i];
		}
		return num;
	    }
	public static void main(String[] args) {
		 System.out.println(Arrays.toString( productExceptSelf(new int[] {-1,1,0,-3,3})));
		 //1,2,3,4
		 System.out.println(Arrays.toString( productExceptSelf(new int[] {1,2,3,4})));
		 //-1,-2,-3,-4
		 System.out.println(Arrays.toString( productExceptSelf(new int[] {-1,-2,-3,-4,-5})));
	}

}
