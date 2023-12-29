import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isprime = true;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                isprime = false;
                break;
            }
        }
        if (isprime) {
            if (n == 1) {
                System.out.println("this is composite no.");
            } else {
                System.out.println("this is prime");
            }
        } else {
            System.out.println("this is not a prime no");
        }
    }
}