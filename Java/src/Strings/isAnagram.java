package Strings;

public class isAnagram {
    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";
        System.out.println(isAnagram(s,t));
    }

     static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] a = new int[26];
        for(int i=0; i<s.length(); i++) {
            a[s.charAt(i) - 'a']++;
        }
         for(int i=0; i<t.length(); i++) {
             a[t.charAt(i) - 'a']--;
         }
        for(int i=0; i<26; i++)
            if(a[i] != 0)
                return false;
        return true;
    }
}
