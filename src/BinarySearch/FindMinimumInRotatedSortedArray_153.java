package BinarySearch;

public class FindMinimumInRotatedSortedArray_153 {
	/*
	 * Suppose an array of length n sorted in ascending order is rotated between 1
	 * and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:
	 * 
	 * [4,5,6,7,0,1,2] if it was rotated 4 times. [0,1,2,4,5,6,7] if it was rotated
	 * 7 times. Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time
	 * results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].
	 * 
	 * Given the sorted rotated array nums of unique elements, return the minimum
	 * element of this array.
	 * 
	 * You must write an algorithm that runs in O(log n) time.
	 */
	static public int findMin(int[] nums) {
		int min = Integer.MAX_VALUE;
		int low = 0, high = nums.length - 1;
		while (low <= high) {

			int mid = (low + high) / 2;

			if (nums[mid] >= nums[high]) {
				min = Math.min(nums[high], min);
				low = mid + 1;

			} else {
				min = Math.min(nums[low], min);
				high = mid;
			}
		}
		return min;
	}

	public static void main(String[] args) {
		System.out.println(findMin(new int[] { 4, 5, 6, 7, 8, 9, 0, 1, 2 }));
	}

}
