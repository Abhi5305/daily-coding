package practice.leet;

import java.util.HashSet;
import java.util.Set;

public class RearrangeString {
    //Rearrange string s according to the order string
    //all the matching characters os string s should be in the same sequence as of order string
    // ex: order = cba and  s = abcdf then output = cbadf (we are not considering order of
    public static void main(String[] args) {
        String order = "cba";
        String s = "aabcdef";
        String result = rearrange( order,  s);
        System.out.println(result);
    }

    private static String rearrange(String order, String s) {
        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();
        int[] countArray = new int[26];
        for(char c : order.toCharArray()){
            set.add(c);
        }
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                sb.append(ch);
            }else{
                countArray[ch - 'a']++;
            }
        }
        for(char c : order.toCharArray()){
            int i = countArray[c-'a'];
            while(i-- > 0){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
