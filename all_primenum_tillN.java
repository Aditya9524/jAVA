import java.util.*;

class all_primenum_tillN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Upper_limit = sc.nextInt();
        for (int k = 1; k <= Upper_limit; k++) {
            int n = k;

            int counter = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.println(n);
            } else {
                continue;
            }
        }
    }
}
