import java.util.*;

public class all_armstrongnum_tillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Upper_limit = sc.nextInt();
        for (int k = 0; k <= Upper_limit; k++) {

            int sum = 0;
            int copy = k;
            while (k > 0) {
                int r = k % 10;
                sum = sum + r * r * r;
                k = k / 10;
            }
            k = copy;
            if (k == sum) {
                System.out.println(k);
            } else {
                continue;
            }
        }
    }
}
