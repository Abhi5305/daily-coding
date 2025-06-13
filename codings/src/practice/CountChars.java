package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChars {
    public static void main(String[] args) {
        String str = "This is a java interview";
        countCharacters(str);

        Map<Character,Integer> hmap = countChars(str);
//        hmap.entrySet().forEach(System.out::println);
    }

    private static Map<Character, Integer> countChars(String str) {
        Map<Character,Integer> hmap = new HashMap<>();
        char[] ch = str.toCharArray();
        for(char c : ch){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        return hmap;
    }
    public static void countCharacters(String str){
        String lower = str.toLowerCase();
        char[] ch = lower.toCharArray();
        int[] countArray = new int[26];
        for(char c : ch){
            if(c != ' '){
                countArray[c-'a']++;
            }
        }

        for(int i=0; i<26; i++){
            if(countArray[i]>0){
                System.out.println((char)(i+'a') +": "+ countArray[i]);
            }
        }
    }


}
