package practice.practice;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public Set<Character> lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0, i = 0, j = 0;

        while (i < s.length() && j < s.length()) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return set;
    }

    public static void main(String[] args) {
        LongestSubstring longestSubstring = new LongestSubstring();
        Set<Character> abhinab = longestSubstring.lengthOfLongestSubstring("abhinab");
        System.out.println(abhinab);
    }

}
