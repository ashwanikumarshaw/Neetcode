package SlidingWindow;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters_3 {
	/*
	 * Given a string s, find the length of the longest substring without repeating
	 * characters.
	 */
	static public int lengthOfLongestSubstring(String s) {
		if (s.length() < 2)
			return s.length();
		HashSet<Character> subStr = new HashSet<>();
		int maxL = 0;
		int len = s.length();
		int i = 0, j = 0;
		while (i < len && j < len) {

			if (!subStr.contains(s.charAt(j))) {
				subStr.add(s.charAt(j));
				j++;
				maxL = Math.max(maxL, j - i);
			} else {
				subStr.remove(s.charAt(i));// removing from first as i starts from 0 and doesn't changes in +ve
											// condition
				i++;
			}
		}
		return maxL;
	}

	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcd"));// 4->abcd
		System.out.println(lengthOfLongestSubstring("abcqcmklsp"));// 7->qcmklsp
		System.out.println(lengthOfLongestSubstring("abca"));// 3->abc
		System.out.println(lengthOfLongestSubstring("aaaa"));// 1->a
	}

}
