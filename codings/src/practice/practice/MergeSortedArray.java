package practice.practice;

import java.util.Arrays;

public class MergeSortedArray {
    public static int[] mergeSortedArrays(int[] arr1,int[] arr2){
        int[] result = new int[arr1.length+ arr2.length];
        int i=0, j=0, k=0;
        while(i< arr1.length && j< arr2.length){
            if (arr1[i]<arr2[j]){
                result[k++]=arr1[i++];
            }
            else {
                result[k++]=arr2[j++];
            }
        }
        while(i< arr1.length){
            result[k++]=arr1[i++];
        }
        while (j< arr2.length){
            result[k++]=arr2[j++];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{23,45,67,78,79,81};
        int[] arr2 = new int[]{12,23,45,56,67};
        int[] result = mergeSortedArrays(arr1,arr2);
        Arrays.stream(result).forEach(System.out::println);
    }
}
