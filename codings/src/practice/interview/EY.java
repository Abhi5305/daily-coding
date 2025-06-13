package practice.interview;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class EY {
    public static void main(String[] args) {
        String input = "Hello Abhinab Hello";
        Arrays.stream(input.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet()
                .forEach(System.out::println);
    }
}
