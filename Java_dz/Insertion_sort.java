package Java_dz;

import java.util.Arrays;

public class Insertion_sort {
    public static void main(String[] args) {
        int[] arr = new int[] {12, 47, 666, 69, 43, 15, 17};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i;
            while(j > 0 && arr[j - 1] > current) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = current;
        }
    }
}
