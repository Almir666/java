package test;

import java.util.Arrays;

public class test_array {
    public static int[] removeElement(int[] arr, int item) {
        return Arrays.stream(arr)
                .filter(i -> i != item)
                .toArray();
    }
 
    public static void main(String[] args) {

        long start = System.currentTimeMillis();
 
        int[] arr = {2, 3, 7, 3, 1, 4, 8, 9};
        int item = 2;

        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = i + 2;
        arr = removeElement(arr, item);
        System.out.println(Arrays.toString(arr));   

        long finish = System.currentTimeMillis();
        long elapsed = finish - start;
        System.out.println(elapsed);  
    }
}



        // StringBuilder sb = new StringBuilder();
        // String str = "";
        // for (int i = 0; i < 100000; i++) {
        //     sb.append(i);
            // str += "+";