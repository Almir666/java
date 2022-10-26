// Найти длину наибольшей последовательности

package Java_seminar.seminar_2;

public class task_1 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 5, 6, 1, 2, 3, 1, 1, 1, 1};
        int[] arr2 = { 1, 2, 5, 3, 6, 1, 2, 1, 1, 1, 2, 4, 6, 1};
        Lcs(arr1, arr2);
    }

    public static void Lcs(int[] array1, int[] array2) {
        int N = array1.length;
        int M = array2.length;
        int maxLength;
        int count = 0;
        if (N >= M) {
            maxLength = N;
        } else {
            maxLength = M;
        }  
        while (maxLength > 0) {
            if (array1[N - 1] == array2[M - 1]) {
                count++;
                N--;
                M--;
                maxLength--;
            } else {
                if (N > M) {
                    N--;
                }
                else{
                    M--;
                }
            }  
        System.out.println(count);  
        }     
    }   
}

