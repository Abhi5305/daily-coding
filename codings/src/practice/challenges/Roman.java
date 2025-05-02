package practice.challenges;

import java.util.HashMap;
import java.util.Map;

public class Roman {
    // I, II, III, IV, V, VI, VII, VIII, IX, X, XI, XII, 
    // I,V,X, IL
    public static void main(String[] args) {
        String strRoman = "MCMXCVII";  // it should be a valid roman value.
        System.out.print(romanToInt(strRoman));
    }

    private static int romanToInt(String strRoman) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;
        for(int i=0;i<strRoman.length();i++){
            //check if the next roman character is bigger
            //if it is bigger then undo that and do this minus previous one
            if(i>0 && map.get(strRoman.charAt(i))>map.get(strRoman.charAt(i-1))){
                result += map.get(strRoman.charAt(i)) - 2 * map.get(strRoman.charAt(i-1));
            }else{
                result += map.get(strRoman.charAt(i));
            }

        }
        return result;
        
    }
}
