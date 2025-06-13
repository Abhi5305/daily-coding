package practice.leet;

public class LengthOfSmallestSubArray {
    public static void main(String[] args) {
        //given an array and target
        // find the minimum length of sub array whose sum is greater than target
        int[] arr = new int[]{3,4,1,6,7,3};
        int target = 10;
        int length = findMinLengthOfSubArray(arr,target);
        System.out.println(length);
    }

    private static int findMinLengthOfSubArray(int[] arr, int target) {
        int left =0, ans = Integer.MAX_VALUE, window = 0;
        for(int right = 0; right<arr.length; right++){
            window += arr[right];
            while(window >= target){
                ans = Math.min(ans,right-left+1);
                window -= arr[left++];
            }
        }
        return ans;
    }
}
