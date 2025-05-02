package practice.leet;

import java.util.HashMap;
import java.util.Map;

class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            for(int j = i+1; j<n; j++){
                if(nums[i]+nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};

    }
    public static int[] twoSumOptimised(int[] nums, int target) {
        int n = nums.length;
        Map<Integer,Integer> hmap = new HashMap<>();
        for(int i = 0; i<n; i++){
           int delta = target - nums[i];
           if(hmap.containsKey(delta)){
               return new int[] {hmap.get(delta),i};
           }
           hmap.put(nums[i],i);
        }

        return new int[]{-1,-1};

    }

    public static int[] twoSumInSortedArray(int[] arr, int target){
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            if(arr[i]+arr[j] == target){
                return new int[]{i,j};
            } else if (arr[i]+arr[j] > target) {
                j--;
            }else {
                i++;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args){
        int[] arr = new int[]{2,7,11,15};
        int target = 20;
        int[] result = twoSumInSortedArray(arr,target);
        for(int i : result){
            System.out.println(i);
        }
    }
}
