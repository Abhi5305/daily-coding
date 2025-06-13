package practice.leet;

import java.util.HashMap;
import java.util.Map;

public class MinSizeCard {
    public static void main(String[] args) {
        //find the length of min size array which has one digit repeated
        int[] arr = new int[]{2,0,4,5,3,5,4,8,3,2};
        int result = findMinLengthOfArray(arr);
        System.out.println(result);
    }

    private static int findMinLengthOfArray(int[] arr) {
        Map<Integer,Integer> hmap = new HashMap<>();
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(hmap.containsKey(arr[i])){
                res = Math.min(res,i-hmap.get(arr[i]));
            }
            hmap.put(arr[i],i);
        }
        return res == Integer.MAX_VALUE ? -1 : res ;
    }
}
