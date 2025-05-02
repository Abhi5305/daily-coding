package practice.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ChallengeOne {
    //input string containing numbers and characters
    //output sum o all numbers in them.
    //Example input = akerhojejp16397nkdshoiwhe79khiew79322n3
    // output = 16397+79+79322+3

    public static void main(String[] args) {
        String str = "dhio345nhw764nj02mjim4nh212hj53";
        str=str.replaceAll("[^\\d]+"," ").strip();

        String[] num1 = str.split(" ");
        String s = Arrays.stream(num1).map(n -> Integer.parseInt(n)).reduce(0, (a, b) -> a + b).toString();
        System.out.println(s);

    }
}
