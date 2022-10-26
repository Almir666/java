package Lesson_1;

import java.util.Iterator;
import java.util.List;

public class listIterator {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d");

        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String element = listIterator.next();
            listIterator.set(element + "+");
        } 
        System.out.print("Измененный arrayList в обратном порядке: ");
        while (listIterator.hasPrevious()) {
            String element = listIterator.previous();
            System.out.print(element + " ");
        }
    }   
}
