package practice.leet;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IntersectionOfMultipleArrays {
    //Given a 2D int array nums where nums[i] is a non empty array of distinct
    // positive integers. return the list of integers that are present in each array of
    // nums sorted in ascending order.
    //input {{3,2,1,4,5},{1,2,3,4},{3,4,5,6}}
    // output [3,4]
    public static void main(String[] args) {
        int[][] nums = new int[][]{{3,2,1,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> result = solution(nums);
        System.out.println(result);
    }

    private static List<Integer> solution(int[][] nums) {
        int n = nums.length;
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int[] i:nums){
            for (int j: i){
                hmap.put(j,hmap.getOrDefault(j,0)+1);
            }
        }
        return hmap.keySet().stream().filter(i-> hmap.get(i)==n).sorted().toList();
    }
}
