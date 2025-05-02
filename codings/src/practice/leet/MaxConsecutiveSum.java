package practice.leet;

public class MaxConsecutiveSum {
    public static void main(String[] args) {
        int[] arr = new int[]{1,1,0,0,1,0,1,0,1,1,1,0,0};
        int res = findMaxSumOfConsequitiveOnesII(arr);
        System.out.println(res);
    }

    private static int findMaxSumOfConsequitiveOnes(int[] arr) {
        int left = 0 ;
        int window = 0;
        int ans = -1;
        for(int right = 0; right < arr.length; right++){
            window += arr[right];
            if(right-left+1 != window){
                window -= arr[left];
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }

    private static int findMaxSumOfConsequitiveOnesII(int[] arr) {
        // you can flip atmost one zero to 1
        int left = 0 ;
        int window = 0;
        int ans = -1;
        for(int right = 0; right < arr.length; right++){
            window += arr[right];
            if(right-left+1 > window+1){
                window -= arr[left];
                left++;
            }
            ans = Math.max(ans,right-left+1);
        }
        return ans;
    }
}
