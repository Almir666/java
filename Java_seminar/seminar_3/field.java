package Java_seminar.seminar_3;

public class field {
    static int position = 0;
    static int[][] storage = new int[10][10];

    static void print() {
        for (int i = 0; i < storage.length; i++) {
            for (int j = 0; j < storage.length; j++)
          System.out.printf(storage[j] + " ");
          System.out.println();
        }
        System.out.println();
      }

    public static void main(String[] args) {
        print();
    }  
}
