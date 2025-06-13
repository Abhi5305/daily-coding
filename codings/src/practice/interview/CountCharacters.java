package practice.interview;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "This is java interview";
        Arrays.stream(str.split(""))
                .map(String::toLowerCase).filter(c-> !c.equals(" "))
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().forEach(System.out::println);
//        countChar(str).entrySet().forEach(System.out::println);
    }
    public static Map<Character, Integer> countChar(String str){
        Map<Character,Integer> hmap = new HashMap<>();
        String lower = str.toLowerCase();

        for(int i=0; i<lower.length(); i++){
            char c = lower.charAt(i);
            if(c != ' '){
                hmap.put(c, hmap.getOrDefault(c,0)+1);
            }
        }
        return hmap;
    }
}
