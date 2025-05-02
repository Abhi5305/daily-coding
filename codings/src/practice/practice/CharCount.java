package practice.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharCount {
    public static void countingCharFromString(String str){
        Map<Character,Integer> hmap = new HashMap<>();
        for(int i=0; i<str.length();i++){
            char ch = str.charAt(i);
            hmap.put(ch,hmap.getOrDefault(ch,0)+1);
        }
        for (Entry entry : hmap.entrySet()){
            System.out.println(entry.getKey()+": "+entry.getValue());
        }
    }
    public static int[] countCharOptimised(String string){
        int[] countChar = new int[26]; //Considering only the lower case characters
        for(int i=0; i<string.length(); i++){
            countChar[string.charAt(i)-'a']++;
        }
        return countChar;
    }

    public static void main(String[] args) {
        countingCharFromString("abhinab");
        int[] result = countCharOptimised("abhinab");
        for (int i=0; i< result.length;i++){
            if(result[i]>0){
                System.out.println("Character : "+(char)(i+'a')+" Count : "+ result[i]);
            }
        }
    }
}
