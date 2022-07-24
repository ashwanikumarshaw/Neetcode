package TwoPointers;

public class ContainerWithMostWater_11 {
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
