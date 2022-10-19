package Java_dz;

public class hanoi_tower_2 {
    public static void main(String[] args) {
        move_tower(3, 'A', 'B', 'C');
    }
    public static void move(char ster1, char ster2) {
            System.out.println("из стержня " + ster1 + " в стержень " + ster2);
            
    }
    public static void move_tower(int n, char ster1, char ster2, char temp) {
        if(n == 0) {
            return;
        }

        move_tower(n - 1, ster1, temp, ster2);
        move(ster1, ster2);
        move_tower(n - 1, temp, ster2, ster1);
        
    }
}
    

