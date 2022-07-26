package BinarySearch;

public class FindMinimumInRotatedSortedArrayII_154 {
	/*
	 * Suppose an array of length n sorted in ascending order is rotated between 1
	 * and n times. For example, the array nums = [0,1,4,4,5,6,7] might become:
	 * 
	 * [4,5,6,7,0,1,4] if it was rotated 4 times. [0,1,4,4,5,6,7] if it was rotated
	 * 7 times. Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time
	 * results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
	 * 
	 * Given the sorted rotated array nums that may contain duplicates, return the
	 * minimum element of this array.
	 * 
	 * You must decrease the overall operation steps as much as possible.
	 */
	static public int findMin(int[] nums) {
		 int left = 0;
	        int right = nums.length-1;
	        
	        while (left<right){
	            while (right-1>left &&nums[right]==nums[right-1]) right--;
	            while (left + 1 < right && nums[left] == nums[left+1]) left++;
	            int mid = left + (right - left) /2;
	            if (nums[mid]<nums[right]) right = mid;
	            else left = mid + 1;
	        }
	        return nums[left];
	}

	public static void main(String[] args) {
		System.out.println(findMin(new int[] { 3, 3, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 2, 3, 3, 3, 3 }));
		System.out.println(findMin(new int[] { 3, 3, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 2, 3, 3, 3, 3, 3 }));

	}

}
