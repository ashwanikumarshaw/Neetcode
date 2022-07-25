package SlidingWindow;

public class MinimumWindowSubstring_76 {
	/*
	 * Given two strings s and t of lengths m and n respectively, return the minimum
	 * window substring of s such that every character in t (including duplicates)
	 * is included in the window. If there is no such substring, return the empty
	 * string "".
	 * 
	 * The test cases will be generated such that the answer is unique.
	 * 
	 * A substring is a contiguous sequence of characters within the string.
	 */
	static public String minWindow(String s, String t) {
		 int[] map = new int[128];
	        for (char c : t.toCharArray()) {
	            map[c] += 1;
	        }
	        int begin = 0;
	        int len = Integer.MAX_VALUE;
	        int count = t.length();
	        for (int left=0, right=0; right<s.length(); right++) {
	            char c = s.charAt(right);
	            map[c]--;
	            if(map[c]>=0) count--; 
	            while (count == 0) {
	                char lc = s.charAt(left);
	                map[lc]++;
	                if (map[lc]>0) {
	                    if (right-left+1<len) {
	                        begin = left;
	                        len = right-left+1;
	                    }
	                    count++;
	                }
	                left++;
	            }
	        }
	        return len==Integer.MAX_VALUE?"":s.substring(begin, begin+len);
        
    }
	public static void main(String[] args) {
		System.out.println(minWindow("ADOBECODEBANC","ABC"));//BANC
		System.out.println(minWindow("a","aa"));//""
		System.out.println(minWindow("a","a"));//a
	}

}
