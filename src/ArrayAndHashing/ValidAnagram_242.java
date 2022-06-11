package ArrayAndHashing;
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

 */
public class ValidAnagram_242 {

    static public boolean isAnagram(String s, String t) {
        if(s.equals(t))
            return true;
        if(s.length()!=t.length())
            return false;

        int[] ch=new int[26];

        for(int i=0;i<s.length();i++){
            ch[((int)s.charAt(i))-97]+=1;
        }
        for(int i=0;i<t.length();i++){
            ch[((int)t.charAt(i))-97]-=1;
        }
        for(int i=0;i<26;i++){
            if(ch[i]!=0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
System.out.println(isAnagram("abcca","cacab"));
    }
}
