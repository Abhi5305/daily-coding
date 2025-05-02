package practice.interview;

public class rotateInteger {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,5,7,3,4,8,5};
        int[] rotated = rotateInSameArray(arr,2);
        for(int i : rotated){
            System.out.println(i);
        }

    }
    public static int[] rotateClockwise(int[] arr, int d){
        int n = arr.length;
        d = d%n;
        int[] rotated = new int[n]; // empty array

        for(int i = 0; i<d; i++){
            rotated[i] = arr[n-d+i];
        }
        for(int i = d; i<n; i++){
            rotated[i] = arr[i-d];
        }
        return rotated;
    }
    public static int[] rotateInSameArray(int[] arr, int d){
        int n = arr.length;
        rev(arr,0,n-d-1);
        rev(arr,n-d,n-1);
        rev(arr,0,n-1);
        return arr;
    }

    private static void rev(int[] arr, int i, int j) {
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}
