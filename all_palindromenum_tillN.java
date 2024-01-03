import java.util.*;

public class all_palindromenum_tillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Upper_limit = sc.nextInt();
        for (int k = 1; k <= Upper_limit; k++) {
            int copy = k;
            int sum = 0;
            while (k > 0) {
                int r = k % 10;// 151, 151%10 = 1
                sum = sum * 10 + r;// 0*10+1= 1, 1*10 + 5 = 15, 15*10 + 1 = 151
                k = k / 10;// 151/10= 15
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
