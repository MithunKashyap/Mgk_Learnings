package Arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFirstNonRepeatingChar {
    public static void main(String[] args) {
        String s = "MithunMithu";
        int idx = firstUniqChar_Ascii(s);
        System.out.println(idx);

    }
    public static int firstUniqChar(String s) {
        char[] ch = s.toCharArray();
        int idx =-1;
        for(int i=0;i<ch.length;i++){
            boolean isRepeatFound = true;
            for(int j=i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    isRepeatFound = false;
                    idx=i;
                    break;
                }
            }
            if(isRepeatFound)
                return idx;
        }
        return idx;
    }

    public static int firstUniqChar_HM(String s) {
        Map<Character, Integer> map= new HashMap<>();
        for (int i = 0; i <s.length() ; i++) {
            if(map.containsKey(s.charAt(i))){
                char ch = s.charAt(i);
                int count = map.get(ch)+1;
                map.put(s.charAt(i),count);
            }else{
                map.put(s.charAt(i),1);
            }
        }
        for (int i = 0; i <s.length() ; i++) {
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }
        return -1;
    }

    public static int firstUniqChar_Ascii(String s) {
//        int[] alphabets = new int[26];
//
//        for (int i = 0; i <s.length() ; i++) {
//            alphabets[s.charAt(i) - 'a']++;
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            if(alphabets[s.charAt(i)-'a'] == 1)
//                return i;
//        }
//        return -1;
        if (s == null || s.length() == 0) {
            return -1;
        }

        int[] charCounts = new int[26];

        for (int i = 0; i < s.length(); i++) {
            int val = Math.abs('a' - s.charAt(i));
            charCounts[i] = val;
        }

        for (int i = 0; i < s.length(); i++) {
            if (charCounts[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        return -1;
    }
}
