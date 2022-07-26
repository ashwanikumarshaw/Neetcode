package BinarySearch;

public class SearchInRotatedSortedArray_33 {
	/*
	 * There is an integer array nums sorted in ascending order (with distinct
	 * values).
	 * 
	 * Prior to being passed to your function, nums is possibly rotated at an
	 * unknown pivot index k (1 <= k < nums.length) such that the resulting array is
	 * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
	 * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
	 * and become [4,5,6,7,0,1,2].
	 * 
	 * Given the array nums after the possible rotation and an integer target,
	 * return the index of target if it is in nums, or -1 if it is not in nums.
	 * 
	 * You must write an algorithm with O(log n) runtime complexity.
	 */
	static public int search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low <= high) {
			// find mid
			int mid = (low + high) / 2;
			
			// check target is on mid
			if (nums[mid] == target)
				return mid;
			// find which side is the target
			// move low or high to mid and ignore half of the array
			// 1.1 check left array is sorted
			// 1.2 check target lies between low and mid
			// 1.2.1 if yes move high to mid-1
			// 1.2.2 if no move low to mid+1
			// else
			// 2.1 check right array is sorted
			// 2.2 check target lies between high and mid
			// 2.2.1 if yes move low to mid+1
			// 2.2.2 if no move high to mid-1
			if (nums[low] <=nums[mid]) {
				if (target >= nums[low] && target <= nums[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} else {
				if (target >= nums[mid] && target <= nums[high]) {
					low = mid + 1;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 1));
		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
		System.out.println(search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 7));
		System.out.println(search(new int[] { 4 }, 0));
		System.out.println(search(new int[] { 4 }, 4));
		System.out.println(search(new int[] { 3,1 }, 4));
		System.out.println(search(new int[] { 3,1 }, 1));
		System.out.println(search(new int[] { 3,1 }, 3));
	}

}
