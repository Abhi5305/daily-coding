package practice.interview;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Capgemini {
    public static void main(String[] args) {
        String s = "aaabbbccccddee";
        Map<String, Long> map = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for(Map.Entry<String,Long> m : map.entrySet()){
            System.out.print(m.getKey()+m.getValue());
        }
//        countChar(s);
    }
    public static void countChar(String s){
        int[] arr = new int[26];
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                System.out.print((char)(i+'a')+""+arr[i]);
            }
        }
    }

}
