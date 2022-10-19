package Java_dz;

public class hanoi_tower {
    public static void main(String[] args) {
        int n = 5;  
        tower_hanoi(n, 'A', 'B', 'C');
    }
    public static void tower_hanoi(int N, char oneShaft, char twoShaft, char threeShaft) {
        if (N == 1) {
            System.out.println("Диск 1 из " + oneShaft + " на " + threeShaft);
        } else {
            tower_hanoi(N - 1, oneShaft, threeShaft, twoShaft);
            System.out.println("Диск " + N + " из " + oneShaft + " на " + threeShaft);
            tower_hanoi(N - 1, twoShaft, oneShaft, threeShaft);
        }
    }
}
