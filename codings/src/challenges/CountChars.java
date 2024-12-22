package challenges;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountChars {
    public static void countCharactersByJavaMethods(String str){
        String lowerString = str.toLowerCase();
        Map<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<str.length(); i++){
            char c = lowerString.charAt(i);
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        hmap.entrySet().forEach(System.out::println);
    }
    public static void countCharactersWithoutUsingJavaMathods(String str){
        String lowercase = str.toLowerCase();
        int[] arr = new int[26];
        for(int i=0;i<str.length(); i++){
            arr[lowercase.charAt(i)-'a']++;
        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0){
                System.out.println((char) (i+'a')+"="+arr[i]);
            }
        }
    }
    public static void countCharacterUsingStream(String str){
        String strLower = str.toLowerCase();
        Arrays.stream(strLower.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet()
                .forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Counting character using java methods");
        countCharactersByJavaMethods("abhinab");
        System.out.println("Counting character without using java methods");
        countCharactersWithoutUsingJavaMathods("abhinab");
        System.out.println("Counting characters using stream");
        countCharacterUsingStream("Abhinab");
    }
}
