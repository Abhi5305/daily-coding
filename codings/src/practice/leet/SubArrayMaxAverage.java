package practice.leet;

public class SubArrayMaxAverage {
    //Max Average from the sub array of size k;
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,-5,-6,50,3};
        int k = 4;
        double average = findMaxAverage(arr,k);
        System.out.println(average);
    }

    private static double findMaxAverage(int[] arr, int k) {
        double ans = 0 ;
        double window = 0;
        int n = arr.length;
        for(int i=0; i<k; i++){
            window += arr[i];
        }
        ans = window/k;
        for(int right = k; right < n; right++){
            window += arr[right] - arr[right-k];
            ans = Math.max(ans,window/k);
        }
        return ans;
    }
}
