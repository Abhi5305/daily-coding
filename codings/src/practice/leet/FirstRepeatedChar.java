package practice.leet;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatedChar {
    public static void main(String[] args) {
        String str= "abhhinab";
        char c = findFirstRepeatedChar(str);
        System.out.println(c);
    }

    private static char findFirstRepeatedChar(String str) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(chars.contains(c)){
                return c;
            }
            chars.add(c);
        }
        return  'a';
    }
}
