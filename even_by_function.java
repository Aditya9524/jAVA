import java.util.*;

public class even_by_function {
    public static void even(int a) {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            } else {
                System.out.println();
            }
        }

    }
}
