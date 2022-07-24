package TwoPointers;

import java.util.Arrays;

public class TwoSumIISortedArray_167 {
	static public int[] twoSum(int[] numbers, int target) {
	        int f=0;
	        int l=numbers.length-1;
	        while(f<l) {
	        	if(numbers[f]+numbers[l]==target)
	        		return new int[] {f+1,l+1};
	        	else if(numbers[f]+numbers[l]>target)
	        		l--;
	        	else
	        		f++;
	        }
			return new int[2];
	    }
	public static void main(String[] args) {

		 System.out.println(Arrays.toString(  twoSum(new int[] {1,2,3,4},6)));
		 System.out.println(Arrays.toString(  twoSum(new int[] {2,7,11,15},9)));
		 System.out.println(Arrays.toString(  twoSum(new int[] {-1,0},-1)));
	}

}
