package ArrayAndHashing;

import java.util.HashSet;

public class LongestConsecutiveSequence_128 {
	/*
	 Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

	 You must write an algorithm that runs in O(n) time.
	 */
	static public int longestConsecutive_nw(int[] nums) {
		if(nums.length==0)
			return 0;
		HashSet<Integer> lookup=new HashSet<>();
		for(int n:nums)
			lookup.add(n);
		int longest=1;
		for(int n:nums) {
			if(lookup.contains(n-1)) {
				int len=1;
				while(lookup.contains(n++))
					len++;
				longest=Math.max(len, longest);
			}
		}
		return longest;
	}
	 static public int longestConsecutive(int[] nums) 
	  {
	      // O(n) time | O(n) space
	      int res = 0;
	      HashSet<Integer> mySet = new HashSet<>();
	      
	      // update mySet
	      for(int num : nums)
	          mySet.add(num);
	      
	      for(int num : mySet)
	      {
	          if(!mySet.contains(num - 1))
	          {
	              int curNum = num;
	              int curRes = 1; 
	              
	              while(mySet.contains(curNum + 1))
	              {
	                  curNum += 1;
	                  curRes += 1;
	              }
	              res = Math.max(res, curRes);
	          }
	      }
	      return res;
	  }
	public static void main(String[] args) {
		
		 System.out.println( longestConsecutive(new int[] {5,155,1,2,3,4}));
			
		 System.out.println( longestConsecutive(new int[] {100,4,200,1,3,2}));
			
		 System.out.println( longestConsecutive(new int[] {0,3,7,2,5,8,4,6,0,1}));
			
	}

}
