package SlidingWindow;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement_424 {

	/*
	 * You are given a string s and an integer k. You can choose any character of
	 * the string and change it to any other uppercase English character. You can
	 * perform this operation at most k times.
	 * 
	 * Return the length of the longest substring containing the same letter you can
	 * get after performing the above operations.
	 */
	static public int characterReplacement(String s, int k) {
		HashMap<Character, Integer> map = new HashMap<>();
		int left = 0, repeat = 0, max = 0;
		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			if (!map.containsKey(ch)) {
				map.put(ch, 0);
			}
			map.put(ch, map.get(ch) + 1);
			// IMPORTANT: repeat is not the accurate number of dominant character, It is the
			// historical maximum count
			// We do not care about it because unless it gets greater, it won't affect our
			// final max window size.
			repeat = Math.max(repeat, map.get(ch));
			if (right - left + 1 - repeat > k) {
				char delete = s.charAt(left);
				map.put(delete, map.get(delete) - 1);
				left++;

			}
			max = Math.max(max, right - left + 1);

		}
		return max;

	}

	public static void main(String[] args) {
		System.out.println(characterReplacement("ABABBA", 2));// 5
		System.out.println(characterReplacement("ABABB", 2));// 5
		System.out.println(characterReplacement("ABCBBA", 1));// 4
		System.out.println(characterReplacement("AAAABA", 2));// 6
		System.out.println(characterReplacement("AAAABA", 1));// 6
		System.out.println(characterReplacement("AB", 1));// 2
		System.out.println(characterReplacement("AB", 0));// 1
		System.out.println(characterReplacement("A", 1));// 1
	}

}
