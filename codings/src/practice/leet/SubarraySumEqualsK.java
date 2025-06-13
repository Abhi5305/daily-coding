package practice.leet;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {
    // Given an array of integers nums and an integer k
    // return total number of sub arrays whose sum equals k
    // a sub array is contiguous non-empty sequence of elements within an array
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int k = 0;
        int result = subarraySumEqualsK(arr,k);
        System.out.println(result);
    }

    private static int subarraySumEqualsK(int[] arr, int k) {
        int res = 0;
        int curr = 0;
        Map<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        //map has key with prefix sum and value as count of that sum
        for (int i : arr){
            curr += i;
            res += hmap.getOrDefault(curr-k,0);
            hmap.put(curr,hmap.getOrDefault(curr,0)+1);
        }
        return res;
    }
}
