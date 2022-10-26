package Lesson_1;

import java.util.PriorityQueue;
import java.util.Stack;
import javax.swing.Popup;

public class lesson_4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(13);
        pq.add(3);
        pq.add(1);
        pq.add(666);
        System.out.println(pq);

        var exp = "1 2 3 * +".split(" ");
        int res = 0;
        System.out.println(exp);

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {
            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    default:
                        break;        
                    }
                }
            }
    }
}

