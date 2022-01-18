package Strings;

public class findDiff {
    public static void main(String[] args) {
        String s = "abcd", t = "abcda";
        System.out.println(findTheDifference(s,t));
    }
        static char findTheDifference(String s, String t) {

            int[] a = new int[26];
            char c= ' ';

            for(int i=0;i<s.length();i++){
                a[s.charAt(i) - 'a']++;
            }

            for(int j=0;j<t.length();j++){
                a[t.charAt(j) - 'a']++;
            }

            for(int k=0;k<26;k++){
                if(a[k]==1)
                    c = (char)(k + 'a');
            }

            return c;
        }
}
