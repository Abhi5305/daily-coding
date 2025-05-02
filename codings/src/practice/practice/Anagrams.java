package practice.practice;

import java.util.Arrays;

public class Anagrams {
    public static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }
    public static boolean areAnagramsOptimized(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        int[] charCount = new int[26]; // Assuming only lowercase English letters
        String str1LowerCase = str1.toLowerCase();
        String str2LowerCase = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            charCount[str1LowerCase.charAt(i) - 'a']++;
            charCount[str2LowerCase.charAt(i) - 'a']--;
        }

        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(areAnagramsOptimized("njhutfv","vnjhtfu"));
    }
}
