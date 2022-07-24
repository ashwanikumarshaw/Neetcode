package TwoPointers;

public class ContainerWithMostWater_11 {
	/*
	 * 
	  You are given an integer array height of length n. There are n vertical lines drawn such that 
	  the two endpoints of the ith line are (i, 0) and (i, height[i]).

	  Find two lines that together with the x-axis form a container, such that the container contains the most water.

		Return the maximum amount of water a container can store.

		Notice that you may not slant the container.
	 */
	static public int maxArea(int[] height) {
		int i = 0;
		int j = height.length - 1;
		int max = 0;
		while (i < j) {
			int ar = (j - i) * Math.min(height[i], height[j]);

			if (ar > max)
				max = ar;

			if (height[i] > height[j])
				j--;
			else
				i++;
		}

		return max;
		
	}

	public static void main(String[] args) {
		System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
	}

}
