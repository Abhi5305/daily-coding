package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,2,3,4,5,3,6,4,5,6,3,4};
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream()
                .filter(num->num.getValue()>1)
                .map(Map.Entry::getKey)
                .toList();
        list.forEach(System.out::println);
    }
}
