package Java_seminar.seminar_3;

import java.util.ArrayList;

public class db {
    static ArrayList<Integer> db = new ArrayList<Integer>();

    public static void remove() {
        db.remove(0);
        show();
    }

    public static void add(int number) {
        db.add(number);
        show();
    }

    public static void show() {
        for (Integer integer: db) {
            System.out.println(integer + " ");
        }
        System.out.println();
    }  
}

