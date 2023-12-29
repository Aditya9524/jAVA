import java.util.*;

public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("x is found on index:" + i);
            }
        }
    }
}
