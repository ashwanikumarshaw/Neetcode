package ArrayAndHashing;

public class ValidPalindrome_125 {
	static public boolean isPalindrome(String s) {
		s=s.toLowerCase();
		int l=s.length()-1;
		int f=0;
		while(f<l) {
			if(s.charAt(f)>96&&s.charAt(f)<123||s.charAt(f)>47&&s.charAt(f)<58) {
				if(s.charAt(l)>96&&s.charAt(l)<123||s.charAt(l)>47&&s.charAt(l)<58) {
					
					if(s.charAt(f)!=s.charAt(l)) 
						return false;
					else {
						f++;
						l--;
					}
				}
				else
					l--;
			}
			else
				f++;
		}
		
		return true;
    }
	public static void main(String[] args) {
		System.out.println(isPalindrome("p 0a} a: p"));
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));

		System.out.println(isPalindrome("race a car"));
	}

}
