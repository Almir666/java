// На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды
// - команда 1 (к1): увеличить а в с раз, а умножается на c
// - команда 2 (к2): увеличить на d, к a прибавляется d
// написать программу, которая выдаёт набор команд, позволяющий число a превратить в число b или сообщить, что это невозможно
// Пример 1: а = 1, b = 7, c = 2, d = 1
// ответ: к2, к2, к2, к2, к2, к2, k2 или к1, к1, к2, к2, к2 
// Можно начать с более простого – просто подсчёта общего количества вариантов 
// Пример 2: а = 11, b = 7, c = 2, d = 1
// ответ: нет решения. 
// *Подумать над тем, как сделать минимальное количество команд

package Java_seminar.seminar_1;

public class task_1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 7;
        int c = 2;
        int d = 1;

        while (a < b){ 
            String res_string = "";
            if (a < b){
                int result = task_1_models.K1(a, c);
                a = result * c;
                res_string += "K1";
                    if (result > b){
                        result = task_1_models.K2(result, d);
                        result = result + d;
                        res_string += "K2";
                            if (result == b){
                            }     
                    }              
            }
        System.out.println(res_string);    
        }

    }
}
