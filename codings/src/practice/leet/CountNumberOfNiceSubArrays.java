package practice.leet;

import java.util.HashMap;
import java.util.Map;

public class CountNumberOfNiceSubArrays {
    //Given an array of integers nums and an integer k A continuous sub array is called
    // nice if there are k odd numbers on it.
    // return the number of nice sub arrays
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,1,1};
        int k = 3;
        int result = countNumberOfNiceSubArrays(nums,k);
        System.out.println(result);
    }

    private static int countNumberOfNiceSubArrays(int[] nums, int k) {
        int res = 0;
        int curr = 0;
        Map<Integer,Integer> hmap = new HashMap<>();
        hmap.put(0,1);
        for(int i: nums){
            curr += i % 2;
            res += hmap.getOrDefault(curr-k,0);
            hmap.put(curr,hmap.getOrDefault(curr,0)+1);
        }
        return res;
    }
}
