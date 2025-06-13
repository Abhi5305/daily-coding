package practice.leet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // From given sorted arrray, remove duplicate elements
        int[] arr = new int[]{1,2,3,4,4,5};
        int lastIndex = removeDuplicatesFromSortedArray(arr);
        for(int i = 0; i < lastIndex; i++){
            System.out.println(arr[i]);
        }
    }

    private static int removeDuplicatesFromSortedArray(int[] arr) {
        // returns the last index+1 after shifting the duplicate elements
        int unique = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>arr[i-1]){
                unique++;
                arr[unique-1] = arr[i];
            }
        }
        return unique;

    }
}
