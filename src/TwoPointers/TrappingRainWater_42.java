package TwoPointers;

public class TrappingRainWater_42 {
	/*
	 * Given n non-negative integers representing an elevation map where the width
	 * of each bar is 1, compute how much water it can trap after raining.
	 * 
	 */
	static public int trap(int[] height) {
		int i = 0, j = height.length - 1;
		int maxL = 0, maxR = 0;
		int res = 0;

		while (i < j) {

			if (height[i] <= height[j]) {
				if (height[i] > maxL)
					maxL = height[i];
				else
					res += maxL - height[i];
				i++;
			} else {
				if (height[j] > maxR)
					maxR = height[j];
				else
					res += maxR - height[j];
				j--;
			}

		}
		return res;

	}

	public static void main(String[] args) {
		System.out.println(trap(new int[] { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1 }));

		System.out.println(trap(new int[] { 4, 2, 0, 3, 2, 5 }));
	}

}
