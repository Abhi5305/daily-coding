package practice.leet;

import java.util.Arrays;
import java.util.List;

public class CountPairs {
    //Count the number of pairs whose sum is less than given target from array
    //arr = [-1,1,2,3,1] , target = 2
    public static void main(String[] args) {
        int[] arr = new int[]{-1,1,2,3,1};
        int target = 2;
        int count = countPairs(arr,target);
        System.out.println(count);
    }


    public static int countPairs(int[] arr, int target) {
        int count = 0;
        Arrays.sort(arr);
        int l = 0;
        int r = arr.length-1;
        while( l < r){
            // -1,1,1,2,3
            if (arr[l] + arr[r] < target){
                count += r-l;
                l++;
            }else {
                r--;
            }
        }
        return count;
    }
}
