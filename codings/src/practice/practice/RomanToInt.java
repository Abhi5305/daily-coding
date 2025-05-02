package practice.practice;

import java.util.Map;

public class RomanToInt {
    public static final Map<Character,Integer> map = Map.of(
            'I',1,
            'V',5,
            'X',10,
            'L',50,
            'C',100,
            'D',500,
            'M',1000
    );
    public static int convertRomanToInt(String roman){
        int total = 0;
        int previous = 0;
        for(int i=roman.length()-1; i>=0;i--){
            int current = map.get(roman.charAt(i));
            if(current<previous){
                total -= current;
            }else{
                total += current;
            }
            previous = current;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(convertRomanToInt("MCMXCVII"));
    }
}
