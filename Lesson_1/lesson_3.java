package Lesson_1;

import java.util.Iterator;
import java.util.List;

public class lesson_3 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        Iterator<Integer> col = list.iterator();
        System.out.println();
      
        while(col.hasNext()){
            System.out.print(col.next() + " ");
        }
    }
}
