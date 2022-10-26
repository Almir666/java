package test;

public class merge_sort {
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 8, 3, 6, 7};
        mergeSort(arr);

        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
    }

    private static void mergeSort(int[] arr) {
        int size = arr.length;
        if (size == 1) return;
        int mid = size / 2;
        int[] l = new int[mid]; 
        int[] r = new int[size - mid]; 

        for (int i = 0; i < mid; i++) {
            l[i] = arr[i];
        }    
        for (int i = mid; i < size; i++) {
            r[i - mid] = arr[i];
        }    

        mergeSort(l);
        mergeSort(r);
        merge(arr, l, r); 
        for (int i = 0; i < arr.length; i ++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void merge(int[] arr, int[] l, int[] r) {
        int left = l.length;
        int right = r.length;
        int i = 0;
        int j = 0;
        int idx = 0;
        while (i < left && j < right) {
            if (l[i] < r[j]) {
                arr[idx] = l[i];
                i ++;
                idx ++;
            }
            else {
                arr[idx] = r[j];
                j ++;
                idx ++;
            }
        }
        for (int ll = i; ll < left; ll ++){
            arr[idx ++] = l[ll];
        }
        for (int rr = j; rr < right; rr ++){
            arr[idx ++] = r[rr];
        }
    }
}










// int[] array = new int[] {15, 78, 89, 9, 12, 12546, 8, 879, 16, 54, 1};
// System.out.println(arrayToString(array));
// array = mergeSort(array);
// }

// public static int[] mergeSort(int[] array) {
// int[] tmp;
// int[] currentSrc = array;
// int[] currentDest = new int[array.length];

// int size = 1;
// while (size < array.length) {
//     for (int i = 0; i < array.length; i += 2 * size) {
//         merge(currentSrc, i, currentSrc, i + size, currentDest, i, size);
//     }

//     tmp = currentSrc;
//     currentSrc = currentDest;
//     currentDest = tmp;

//     size = size * 2;

//     System.out.println(arrayToString(currentSrc));
// }
// return currentSrc;
// }

// private static void merge(int[] src1, int src1Start, int[] src2, int src2Start, int[] dest,
//     int destStart, int size) {
// int index1 = src1Start;
// int index2 = src2Start;

// int src1End = Math.min(src1Start + size, src1.length);
// int src2End = Math.min(src2Start + size, src2.length);

// if (src1Start + size > src1.length) {
//     for (int i = src1Start; i < src1End; i++) {
//         dest[i] = src1[i];
//     }
//     return;
// }

// int iterationCount = src1End - src1Start + src2End - src2Start;

// for (int i = destStart; i < destStart + iterationCount; i++) {
//     if (index1 < src1End && (index2 >= src2End || src1[index1] < src2[index2])) {
//         dest[i] = src1[index1];
//         index1++;
//     } else {
//         dest[i] = src2[index2];
//         index2++;
//     }
// }
// }

// private static String arrayToString(int[] array) {
// StringBuilder sb = new StringBuilder();
// sb.append("[");
// for (int i = 0; i < array.length; i++) {
//     if (i > 0) {
//         sb.append(", ");
//     }
//     sb.append(array[i]);
// }
// sb.append("]");
// return sb.toString();