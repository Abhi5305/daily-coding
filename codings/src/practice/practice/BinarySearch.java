package practice.practice;

public class BinarySearch {
    public static void main(String[] args) {
        //given a rotated array find the index the given key
        int[] arr = new int[]{5,6,7,8,9,10,1,2,3};
        int key = 10;
        int n = arr.length;
        int pivot = getPivot(arr,0,n);
        int index = bs(arr,0,pivot,key);
        if(index == -1){
            index = bs(arr,pivot+1,n,key);
        }
        System.out.println(index);
    }

    private static int bs(int[] arr, int l, int r,int key) {
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid] == key){
                return mid;
            } else if (arr[mid] > key) {
                l = mid + 1;
            }else {
                r = mid - 1;
            }
        }
        return -1;
    }

    private static int getPivot(int[] arr, int l, int r) {
        while(l<r){
            int mid = (l+r)/2;
            if(arr[mid]>arr[mid-1]){
                return mid;
            } else if (arr[mid] < arr[mid-1]) {
                return mid-1;
            } else if (arr[mid] > arr[l]) {
                l++;
            }else {
                r--;
            }
        }
        return -1;
    }
}
