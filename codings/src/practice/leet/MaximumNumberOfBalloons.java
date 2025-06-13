package practice.leet;

import java.util.HashMap;
import java.util.Map;

public class MaximumNumberOfBalloons {
    // Given a string text, you want to use characters of text
    // to form as many instances of the word "balloon" as possible.
    // you can use each character in text at most once.
    // return maximum number of instances can be formed.
    public static void main(String[] args) {
        String text = "nlaebolkooabnllolloo";
        int result = maxNumberOfBalloons(text);
        System.out.println(result);
    }

    private static int maxNumberOfBalloons(String text) {
        Map<Character,Integer> hmap = new HashMap<>();
        for(char c : text.toCharArray()){
            hmap.put(c,hmap.getOrDefault(c,0)+1);
        }
        //in a single instance b,a,n comes 1 time but l,o comes twice.
        int ban = Math.min(hmap.getOrDefault('b',0),Math.min(hmap.getOrDefault('a',0),hmap.getOrDefault('n',0)));
        int lo = Math.min(hmap.getOrDefault('l',0),hmap.getOrDefault('o',0));
        return Math.min(lo/2,ban);
    }
}
