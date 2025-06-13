package practice.leet;

import java.util.HashSet;
import java.util.Set;

public class Pangram {
    //pangram is a word where every letters of English alphabet appears at least once
    public static void main(String[] args) {
        String str = "qqwertyuiopasdfghjklzxcvbnnvkdkjflkmmm";
        boolean result = isPangram(str);
        System.out.println(result);
    }

    private static boolean isPangramUSingSet(String str) {
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            charSet.add(str.charAt(i));
        }
        return charSet.size() == 26;
    }

    private static boolean isPangram(String str) {
        int[] arr = new int[26];
        char[] ch = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            arr[ch[i]-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if(arr[i] == 0){
                return false;
            }
        }
        return true;
    }
}
