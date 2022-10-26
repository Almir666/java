// Описать структуру такую, что:
// Есть хранилище, можно добавить извлечь.
// 0 0 0 0 0 0 0 0 0 0
// void add (int item)
// int remove (void)
// add(2)
// 2 0 0 0 0 0 0 0 0 0
// add(12)
// 2 12 0 0 0 0 0 0 0 0
// add(1)
// 2 12 1 0 0 0 0 0 0 0
// el = remove()
// 12 1 0 0 0 0 0 0 0 0
// el = remove()
// 1 0 0 0 0 0 0 0 0 0

package Java_seminar.seminar_3;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите команду: ");
        while (true) {
            switch (scan.nextInt()) {
                case 1:
                System.out.println("Введите число: ");
                db.add(scan.nextInt());
                break;

                case 2:
                db.remove();
                break;  

                case 3:
                db.show();
                break;

                case 0:
                scan.close();
                System.out.println("Закончили");
                break;

                default:
                System.out.println("Вы ввели не верные данные");
            }
        }
    }
}
