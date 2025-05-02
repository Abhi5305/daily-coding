package practice.leet;

public class SumDifference {
    public static void main(String[] args) {
        //nums1 = sum of first n numbers which is not divisible by m
        //nums2 = sum of first n numbers which is  divisible by m
        // find the difference
        int n = 10;
        int m = 2;
        int difference = findDifference(n,m);
        System.out.println(difference);

    }

    private static int findDifference(int n, int m) {
        int x = n/m;
        int num2 = m * x * (x+1) / 2;
        int num1 = n * (n+1) / 2 - num2 ;
        return Math.abs(num1-num2);
    }
}
