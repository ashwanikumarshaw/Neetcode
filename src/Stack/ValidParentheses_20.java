package Stack;

import java.util.Stack;

public class ValidParentheses_20 {
	/*
	 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
	 * ']', determine if the input string is valid.
	 * 
	 * An input string is valid if:
	 * 
	 * Open brackets must be closed by the same type of brackets. Open brackets must
	 * be closed in the correct order.
	 */
	static public boolean isValid(String s) {
		Stack<Character> s1 = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[')
				s1.push(s.charAt(i));
			else {
				if (s1.size() == 0)
					return false;
				char ch1 = s1.pop();
				char ch2 = s.charAt(i);
				if (ch1 == '(' && ch2 != ')' || ch1 == '{' && ch2 != '}' || ch1 == '[' && ch2 != ']')
					return false;
			}
		}
		if (s1.size() != 0)
			return false;

		return true;

	}

	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));// true
		System.out.println(isValid("()"));// true
		System.out.println(isValid("([]{})"));// true
		System.out.println(isValid("(}"));// false
		System.out.println(isValid("({[]}"));// false
		System.out.println(isValid("({[]}))"));// false
		System.out.println(isValid("}{"));// false
	}

}
