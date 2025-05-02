package practice.practice;

import java.util.*;
import java.util.stream.Collectors;

public class StatisticsCollectors {
    public static void main(String[] args) {
        //find the max from the list of numbers
        List<Integer> numbers = Arrays.asList(2,4,6,8,9,12,42,16,28,13,39);
        IntSummaryStatistics intSummaryStatistics = numbers.stream().mapToInt(i -> i).summaryStatistics();
//        System.out.println(intSummaryStatistics);
        List<Integer> sortedList = numbers.stream().sorted((a,b)->b.compareTo(a)).toList();
        System.out.println(sortedList);
        //divide it into even and odd
        Map<Boolean, List<Integer>> collect = numbers.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));
        System.out.println(collect.entrySet());
    }
}
